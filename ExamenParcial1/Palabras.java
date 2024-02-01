package examen;

public class Palabras {
	String cadena;
	
	public Palabras(String cadena) {
		this.cadena = cadena;
	}
	
	
	public void convertirPrimeraMayuscula() {
		String mayuscula = cadena.substring(0,1).toUpperCase() + cadena.substring(1);
		System.out.println(mayuscula);
	}
	
	
	public void invertirCadena() {
		StringBuilder invertir = new StringBuilder(cadena).reverse();
		System.out.println(invertir);
	}
	
	
	public void convertirVocalesMayuscula() {
		if (cadena != null ) {
	           StringBuilder cadenaModificada = new StringBuilder();
	           for (char caracter : cadena.toCharArray()) {
	               if ("aeiouAEIOU".contains(String.valueOf(caracter))) {
	                   cadenaModificada.append(Character.toUpperCase(caracter));
	               } else {
	                   cadenaModificada.append(caracter);
	               }
	           }
	           System.out.println(cadenaModificada.toString());
	       }
	}
	
	
	public boolean checarPalindromo() {
		 if (cadena != null &&! cadena.isEmpty()) {
	            String cleanCadena = cadena.replaceAll("[ +]", "").toLowerCase();
	            String reversed = new StringBuilder(cleanCadena).reverse().toString();
	            return cleanCadena.equals(reversed);
	        } else {
	            return false;
	        }
	}

}
