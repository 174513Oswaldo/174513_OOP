package actividad;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class TerceraImagen {
	static int width = 760;
    static int height = 1040;
    
    static Color azul = new Color(190,232,254);
    static Color rojo = new Color(170,52,51);
    
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
    	drawBackground(PIXEL_SIZE, azul); 
    	drawHorizontalLine(9, 13, 1, Color.black);
    	
    	putPixel(8, 2, Color.black);
    	drawHorizontalLine(9, 13, 2, Color.white);
    	putPixel(14, 2, Color.black);
    	
    	putPixel(7, 3, Color.black);
    	drawHorizontalLine(8, 14, 3, Color.white);
    	putPixel(15, 3, Color.black);
    	
    	drawHorizontalLine(4, 6, 4, Color.black);
    	drawHorizontalLine(7, 15, 4, Color.white);
    	putPixel(16, 4, Color.black);
    	
    	putPixel(3, 5, Color.black);
    	drawHorizontalLine(4, 7, 5, Color.white);
    	putPixel(8, 5, Color.black);
    	drawHorizontalLine(9, 12, 5, Color.white);
    	putPixel(13, 5, Color.black);
    	putPixel(14, 5, Color.white);
    	drawHorizontalLine(15, 16, 5, Color.black);
    	
    	drawHorizontalLine(1, 2, 6, Color.black);
    	drawHorizontalLine(3, 7, 6, Color.white);
    	putPixel(8, 6, Color.black);
    	drawHorizontalLine(9, 11, 6, Color.white);
    	putPixel(12, 6, Color.black);
    	putPixel(13, 6, Color.white);
    	drawHorizontalLine(14, 15, 6, Color.black);
    	putPixel(16, 6, Color.white);
    	putPixel(17, 6, Color.black);
    	
    	drawHorizontalLine(1, 2, 7, Color.black);
    	drawHorizontalLine(3, 11, 7, Color.white);
    	putPixel(12, 7, Color.black);
    	putPixel(13, 7, Color.white);
      	drawHorizontalLine(14, 17, 7, Color.black);
    	
    	putPixel(2, 8, Color.black);
    	drawHorizontalLine(3, 11, 8, Color.white);
    	putPixel(12, 8, Color.black);
    	putPixel(13, 8, Color.white);
      	drawHorizontalLine(14, 17, 8, Color.black);
      	
      	putPixel(3, 9, Color.black);
    	drawHorizontalLine(4, 11, 9, Color.white);
    	putPixel(12, 9, Color.black);
    	putPixel(13, 9, Color.white);
      	drawHorizontalLine(14, 17, 9, Color.black);
      	
       	drawHorizontalLine(4, 5, 10, Color.black);
    	drawHorizontalLine(6, 11, 10, Color.white);
    	putPixel(12, 10, Color.black);
    	putPixel(13, 10, Color.white);
      	drawHorizontalLine(14, 17, 10, Color.black);
      	
    	drawHorizontalLine(6, 8, 11, Color.black);
    	drawHorizontalLine(9, 10, 11, Color.white);
    	putPixel(11, 11, Color.black);
    	putPixel(13, 11, Color.black);
    	putPixel(14, 11, Color.white);
      	drawHorizontalLine(15, 16, 11, Color.black);
      	
      	drawHorizontalLine(8, 10, 12, rojo);
      	drawHorizontalLine(14, 15, 12, Color.black);
      	
      	putPixel(7, 13, Color.black);
    	drawHorizontalLine(8, 10, 13, Color.white);
    	putPixel(11, 13, Color.black);
      	
    	putPixel(6, 14, Color.black);
    	drawHorizontalLine(7, 8, 14, Color.white);
    	putPixel(9, 14, Color.black);
    	putPixel(10, 14, Color.white);
    	putPixel(11, 14, Color.black);
    	
    	putPixel(6, 15, Color.black);
    	drawHorizontalLine(7, 8, 15, Color.white);
    	putPixel(9, 15, Color.black);
    	putPixel(10, 15, Color.white);
    	putPixel(11, 15, Color.black);
    	
    	putPixel(5, 16, Color.black);
    	drawHorizontalLine(6, 8, 16, Color.white);
    	putPixel(9, 16, Color.black);
    	drawHorizontalLine(10, 11, 16, Color.white);
    	putPixel(12, 16, Color.black);
    	
    	putPixel(5, 17, Color.black);
    	drawHorizontalLine(6, 8, 17, Color.white);
    	putPixel(9, 17, Color.black);
    	drawHorizontalLine(10, 11, 17, Color.white);
    	putPixel(12, 17, Color.black);
    	
    	putPixel(5, 18, Color.black);
    	drawHorizontalLine(6, 9, 18, Color.white);
    	drawHorizontalLine(10, 11, 18, Color.black);
    	
    	putPixel(6, 19, Color.black);
    	drawHorizontalLine(7, 10, 19, Color.white);
    	drawHorizontalLine(11, 12, 19, Color.black);
    	
    	putPixel(7, 20, Color.black);
    	drawHorizontalLine(8, 12, 20, Color.white);
    	putPixel(13, 20, Color.black);
    	
    	putPixel(8, 21, Color.black);
    	putPixel(9, 21, Color.white);
    	drawHorizontalLine(10, 12, 21, Color.black);
    	
    	drawHorizontalLine(6, 7, 22, Color.black);
    	drawHorizontalLine(8, 10, 22, Color.white);
    	putPixel(11, 22, Color.black);
    	
    	putPixel(5, 23, Color.black);
    	drawHorizontalLine(6, 11, 23, Color.white);
    	putPixel(12, 23, Color.black);
    	
    	drawHorizontalLine(5, 12, 24, Color.black);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);

        
        try {       
            ImageIO.write(image, "jpg", new File("Snoopy.jpg"));
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


