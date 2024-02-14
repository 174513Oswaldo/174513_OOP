package actividad;

public class MyQueues {
	
	public char[] queue;
	public int MAX;
	public int tail;
	
	
	public MyQueues(int size) {
		MAX = size;
		tail = 0;
		queue = new char[MAX];
	}
	
	
	public char delete() {
		if(tail > 0) {
			char deletedObj = queue[0];
			for (int i = 0; i < tail - 1; i++) {
                queue[i] = queue[i + 1];
            }
            tail--;
            return deletedObj;
		}else {
			 System.out.println("La cola se encuentra vacia");
	            return '#';
		}
	}
		
		
	public void insert(char obj) {
		if (tail == MAX) {
				System.out.println("La cola se encuentra llena");
		}else {
				queue[tail] = obj; 
				tail ++;
			}
	}

	
	
	
}
