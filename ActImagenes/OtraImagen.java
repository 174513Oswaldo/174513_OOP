package actividad;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class OtraImagen {
	static int width = 1080; //cambiar
    static int height = 1040;// cambiar
    
    static Color cafe = new Color(205,156,124);
    
    static Graphics2D g;

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    private final static int PIXEL_SIZE = 40;
    private final static Color[][] PIXELS = {
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white); 
    	drawHorizontalLine(5, 8, 1, Color.black);
    	drawHorizontalLine(15, 18, 1, Color.black);
    	
    	drawHorizontalLine(3, 4, 2, Color.black);
    	drawHorizontalLine(5, 8, 2, cafe);
    	drawHorizontalLine(9, 14, 2, Color.black);
    	drawHorizontalLine(15, 18, 2, cafe);
    	drawHorizontalLine(19, 20, 2, Color.black);
    	
    	putPixel(2, 3, Color.black);
    	drawHorizontalLine(3, 20, 3, cafe);
    	putPixel(21, 3, Color.black);
    	
    	putPixel(2, 4, Color.black);
    	drawHorizontalLine(3, 6, 4, cafe);
    	putPixel(7, 4, Color.black);
    	drawHorizontalLine(8, 15, 4, cafe);
    	putPixel(16, 4, Color.black);
    	drawHorizontalLine(17, 20, 4, cafe);
    	putPixel(21, 4, Color.black);
    	
    	putPixel(2, 5, Color.black);
    	drawHorizontalLine(3, 6, 5, cafe);
    	putPixel(7, 5, Color.black);
    	drawHorizontalLine(8, 15, 5, cafe);
    	putPixel(16, 5, Color.black);
    	drawHorizontalLine(17, 20, 5, cafe);
    	putPixel(21, 5, Color.black);
    	
    	putPixel(2, 6, Color.black);
    	drawHorizontalLine(3, 5, 6, cafe);
    	putPixel(6, 6, Color.black);
    	drawHorizontalLine(7, 16, 6, cafe);
    	putPixel(17, 6, Color.black);
    	drawHorizontalLine(18, 20, 6, cafe);
    	putPixel(21, 6, Color.black);
    	
    	putPixel(2, 7, Color.black);
     	putPixel(3, 7, cafe);
     	drawHorizontalLine(4, 5, 7, Color.black);
     	putPixel(6, 7, cafe);
    	putPixel(8, 7, Color.black);
    	drawHorizontalLine(9, 10, 7, cafe);
    	drawHorizontalLine(13, 14, 7, cafe);
    	putPixel(15, 7, Color.black);
    	putPixel(17, 7, cafe);
    	drawHorizontalLine(18,19, 7, Color.black);
     	putPixel(20, 7, cafe);
    	putPixel(21, 7, Color.black);
  
    	drawHorizontalLine(2, 3, 8, Color.black);
    	putPixel(5, 8, Color.black);
    	putPixel(6, 8, cafe);
    	drawHorizontalLine(7, 8, 8, Color.black);
     	drawHorizontalLine(9, 10, 8, cafe);
     	drawHorizontalLine(13, 14, 8, cafe);
     	drawHorizontalLine(15, 16, 8, Color.black);
    	putPixel(17, 8, cafe);
    	putPixel(18, 8, Color.black);
    	drawHorizontalLine(20, 21, 8, Color.black);
    	
    	putPixel(5, 9, Color.black);
    	putPixel(6, 9, cafe);
    	drawHorizontalLine(7, 8, 9, Color.black);
    	putPixel(9, 9, cafe);
    	putPixel(14, 9, cafe);
    	drawHorizontalLine(15, 16, 9, Color.black);
    	putPixel(17, 9, cafe);
    	putPixel(18, 9, Color.black);
    	
    	putPixel(5, 10, Color.black);
    	drawHorizontalLine(6, 8, 10, cafe);
    	drawHorizontalLine(10, 13, 10, Color.black);
    	drawHorizontalLine(15, 17, 10, cafe);
    	putPixel(18, 10, Color.black);
    	
     	putPixel(5, 11, Color.black);
     	drawHorizontalLine(6, 7, 11, cafe);
    	drawHorizontalLine(11, 12, 11, Color.black);
    	drawHorizontalLine(16, 17, 11, cafe);
    	putPixel(18, 11, Color.black);
     	
    	putPixel(6, 12, Color.black);
    	putPixel(7, 12, cafe);
    	putPixel(16, 12, cafe);
    	putPixel(17, 12, Color.black);
    	
    	putPixel(7, 13, Color.black);
    	drawHorizontalLine(11, 12, 13, Color.black);
    	putPixel(16, 13, Color.black);
    	putPixel(17, 13, cafe);
    	putPixel(18, 13, Color.black);
    	
    	drawHorizontalLine(8, 10, 14, Color.black);
    	drawHorizontalLine(13, 15, 14, Color.black);
    	drawHorizontalLine(16, 17, 14, cafe);
    	putPixel(18, 14, Color.black);
    	drawHorizontalLine(21, 22, 14, Color.black);
    	
    	putPixel(7, 15, Color.black);
    	drawHorizontalLine(8, 10, 15, cafe);
    	drawHorizontalLine(11, 12, 15, Color.black);
    	drawHorizontalLine(13, 16, 15, cafe);
    	putPixel(17, 15, Color.black);
    	putPixel(18, 15, cafe);
    	putPixel(19, 15, Color.black);
    	putPixel(21, 15, Color.black);
    	putPixel(23, 15, Color.black);
    	
    	putPixel(7, 16, Color.black);
    	drawHorizontalLine(8, 9, 16, cafe);
    	drawHorizontalLine(15, 16, 16, cafe);
    	putPixel(17, 16, Color.black);
    	putPixel(18, 16, cafe);
    	putPixel(19, 16, Color.black);
    	putPixel(22, 16, Color.black);
    	putPixel(24, 16, Color.black);
    	
    	putPixel(7, 17, Color.black);
    	putPixel(8, 17, cafe);
    	putPixel(16, 17, cafe);
    	putPixel(17, 17, Color.black);
    	drawHorizontalLine(18, 19, 17, cafe);
    	putPixel(20, 17, Color.black);
    	putPixel(22, 17, Color.black);
    	putPixel(24, 17, Color.black);
    	
    	putPixel(7, 18, Color.black);
    	drawHorizontalLine(8, 9, 18, cafe);
    	putPixel(12, 18, Color.black);
       	drawHorizontalLine(15, 16, 18, cafe);
    	putPixel(17, 18, Color.black);
    	drawHorizontalLine(18, 19, 18, cafe);
    	putPixel(20, 18, Color.black);
    	putPixel(22, 18, Color.black);
    	putPixel(23, 18, cafe);
    	putPixel(24, 18, Color.black);
    	
    	putPixel(8, 19, Color.black);
    	drawHorizontalLine(9, 10, 19, cafe);
    	putPixel(12, 19, Color.black);
    	drawHorizontalLine(14, 15, 19, cafe);
    	putPixel(16, 19, Color.black);
    	drawHorizontalLine(17, 20, 19, cafe);
    	putPixel(21, 19, Color.black);
    	drawHorizontalLine(22, 23, 19, cafe);
    	putPixel(24, 19, Color.black);
    	
    	putPixel(8, 20, Color.black);
    	drawHorizontalLine(9, 11, 20, cafe);
    	putPixel(12, 20, Color.black);
    	drawHorizontalLine(13, 15, 20, cafe);
    	drawHorizontalLine(16, 18, 20, Color.black);
    	drawHorizontalLine(19, 20, 20, cafe);
    	putPixel(21, 20, Color.black);
    	drawHorizontalLine(22, 23, 20, cafe);
    	putPixel(24, 20, Color.black);
    	
    	putPixel(8, 21, Color.black);
    	drawHorizontalLine(9, 11, 21, cafe);
    	putPixel(12, 21, Color.black);
    	drawHorizontalLine(13, 15, 21, cafe);
    	putPixel(16, 21, Color.black);
    	drawHorizontalLine(17, 20, 21, cafe);
    	putPixel(21, 21, Color.black);
    	putPixel(22, 21, cafe);
    	putPixel(23, 21, Color.black);
    	
    	putPixel(7, 22, Color.black);
    	drawHorizontalLine(9, 10, 22, cafe);
    	putPixel(11, 22, Color.black);
    	putPixel(12, 22, cafe);
    	putPixel(13, 22, Color.black);
    	drawHorizontalLine(14, 15, 22, cafe);
    	putPixel(17, 22, Color.black);
    	drawHorizontalLine(18, 20, 22, cafe);
    	putPixel(21, 22, Color.black);
    	putPixel(22, 22, cafe);
    	putPixel(23, 22, Color.black);
    	
    	putPixel(6, 23, Color.black);
    	putPixel(10, 23, cafe);
    	drawHorizontalLine(11, 13, 23, Color.black);
    	putPixel(14, 23, cafe);
    	putPixel(18, 23, Color.black);
    	drawHorizontalLine(19, 20, 23, cafe);
    	drawHorizontalLine(21, 22, 23, Color.black);
    	
    	drawHorizontalLine(6, 10, 24, Color.black);
    	drawHorizontalLine(14, 21, 24, Color.black);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);
        

        try {       
            ImageIO.write(image, "jpg", new File("Perro.jpg"));
            System.out.println("Todo bien:)!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}

