package actividad;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Totoro {
	static int width = 1000;
    static int height = 1360;
    
    static Color naranja = new Color(246,172,24);
    static Color gris = new Color(128,128,128);
    static Color azul1 = new Color(88,157,215);
    static Color azul2 = new Color(50,83,151);
  
    
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
    	drawBackground(PIXEL_SIZE, naranja); 
    	drawHorizontalLine(12, 13, 1, Color.black);
    	
    	drawHorizontalLine(9, 16, 2, Color.black);
    
    	drawHorizontalLine(7, 8, 3, Color.black);
    	putPixel(9, 3, azul1);
    	putPixel(10, 3, azul2);
    	putPixel(11, 3, Color.black);
    	drawHorizontalLine(12, 13, 3, azul2);
    	putPixel(14, 3, Color.black);
    	putPixel(15, 3, azul1);
    	putPixel(16, 3, azul2);
    	drawHorizontalLine(17, 18, 3, Color.black);
    	
    	putPixel(6, 4, Color.black);
    	drawHorizontalLine(7, 8, 4, azul1);
    	putPixel(9, 4, azul2);
    	putPixel(10, 4, Color.black);
    	putPixel(11, 4, azul2);
    	putPixel(12, 4, azul1);
    	drawHorizontalLine(13, 14, 4, azul2);
    	putPixel(15, 4, Color.black);
    	putPixel(16, 4, azul1);
    	drawHorizontalLine(17, 18, 4, azul2);
    	putPixel(19, 4, Color.black);
    	
    	putPixel(5, 5, Color.black);
    	drawHorizontalLine(6, 7, 5, azul1);
    	putPixel(8, 5, azul2);
    	putPixel(9, 5, Color.black);
    	putPixel(10, 5, azul2);
    	drawHorizontalLine(11, 12, 5, azul1);
    	drawHorizontalLine(13, 15, 5, azul2);
    	putPixel(16, 5, Color.black);
    	putPixel(17, 5, azul1);
    	drawHorizontalLine(18, 19, 5, azul2);
    	putPixel(20, 5, Color.black);
    	
    	putPixel(4, 6, Color.black);
    	drawHorizontalLine(5, 6, 6, azul1);
    	drawHorizontalLine(7, 8, 6, azul2);
    	putPixel(9, 6, Color.black);
    	putPixel(10, 6, azul2);
    	drawHorizontalLine(11, 12, 6, azul1);
    	drawHorizontalLine(13, 15, 6, azul2);
    	putPixel(16, 6, Color.black);
    	putPixel(17, 6, azul1);
    	drawHorizontalLine(18, 20, 6, azul2);
    	putPixel(21, 6, Color.black);
    	
    	putPixel(3, 7, Color.black);
    	drawHorizontalLine(4, 5, 7, azul1);
    	drawHorizontalLine(6, 7, 7, azul2);
    	putPixel(8, 7, Color.black);
    	putPixel(9, 7, azul2);
    	drawHorizontalLine(10, 11, 7, azul1);
    	drawHorizontalLine(12, 16, 7, azul2);
    	putPixel(17, 7, Color.black);
    	putPixel(18, 7, azul1);
    	drawHorizontalLine(19, 21, 7, azul2);
    	putPixel(22, 7, Color.black);
    	
    	putPixel(3, 8, Color.black);
    	putPixel(4, 8, azul1);
    	drawHorizontalLine(5, 7, 8, azul2);
    	putPixel(8, 8, Color.black);
    	drawHorizontalLine(9, 11, 8, azul1);
    	drawHorizontalLine(12, 16, 8, azul2);
    	putPixel(17, 8, Color.black);
    	putPixel(18, 8, azul1);
    	drawHorizontalLine(19, 21, 8, azul2);
    	putPixel(22, 8, Color.black);
    	
    	putPixel(2, 9, Color.black);
    	putPixel(3, 9, azul1);
    	putPixel(4, 9, azul2);
    	drawHorizontalLine(5, 19, 9, Color.black);
    	drawHorizontalLine(20, 22, 9, azul2);
    	putPixel(23, 9, Color.black);
    	
    	drawHorizontalLine(2, 4, 10, Color.black);
    	putPixel(6, 10, Color.black);
    	putPixel(7, 10, gris);
    	putPixel(8, 10, Color.black);
    	putPixel(13, 10, Color.black);
    	putPixel(15, 10, Color.black);
    	putPixel(16, 10, gris);
    	putPixel(17, 10, Color.black);
    	drawHorizontalLine(20, 23, 10, Color.black);
    	
    	putPixel(2, 11, Color.black);
    	putPixel(6, 11, Color.black);
    	drawHorizontalLine(7, 8, 11, gris);
    	drawHorizontalLine(9, 14, 11, Color.black);
    	drawHorizontalLine(15, 16, 11, gris);
    	putPixel(17, 11, Color.black);
    	putPixel(23, 11, Color.black);
    	
    	putPixel(5, 12, Color.black);
    	drawHorizontalLine(6, 12, 12, gris);
    	putPixel(13, 12, Color.black);
    	drawHorizontalLine(14, 17, 12, gris);
    	putPixel(18, 12, Color.black);
    	
    	putPixel(2, 13, Color.black);
    	putPixel(5, 13, Color.black);
    	drawHorizontalLine(6, 8, 13, Color.white);
    	drawHorizontalLine(9, 12, 13, gris);
    	putPixel(13, 13, Color.black);
    	putPixel(14, 13, gris);
    	drawHorizontalLine(15, 17, 13, Color.white);
    	putPixel(18, 13, Color.black);
    	putPixel(21, 13, Color.black);
    	
    	drawHorizontalLine(3, 4, 14, Color.black);
    	putPixel(5, 14, gris);
    	putPixel(6, 14, Color.white);
    	putPixel(7, 14, Color.black);
    	putPixel(8, 14, Color.white);
    	drawHorizontalLine(9, 10, 14, gris);
    	drawHorizontalLine(11, 13, 14, Color.black);
    	putPixel(14, 14, gris);
    	putPixel(15, 14, Color.white);
    	putPixel(16, 14, Color.black);
    	putPixel(17, 14, Color.white);
    	putPixel(18, 14, gris);
    	drawHorizontalLine(19, 20, 14, Color.black);
    	
    	putPixel(4, 15, Color.black);
    	putPixel(5, 15, gris);
    	drawHorizontalLine(6, 8, 15, Color.white);
    	drawHorizontalLine(9, 12, 15, gris);
    	putPixel(13, 15, Color.black);
    	putPixel(14, 15, gris);
    	drawHorizontalLine(15, 17, 15, Color.white);
    	putPixel(18, 15, gris);
    	putPixel(19, 15, Color.black);
    	
    	drawHorizontalLine(1, 3, 16, Color.black);
    	drawHorizontalLine(4, 12, 16, gris);
    	putPixel(13, 16, Color.black);
    	drawHorizontalLine(14, 19, 16, gris);
    	drawHorizontalLine(20, 22, 16, Color.black);
    	
    	putPixel(3, 17, Color.black);
    	drawHorizontalLine(4, 9, 17, gris);
    	drawHorizontalLine(10, 12, 17, Color.white);
    	drawHorizontalLine(13, 15, 17, Color.black);
    	drawHorizontalLine(16, 19, 17, gris);
    	putPixel(20, 17, Color.black);
    	
    	putPixel(3, 18, Color.black);
    	drawHorizontalLine(4, 7, 18, gris);
    	drawHorizontalLine(8, 12, 18, Color.white);
    	putPixel(13, 18, Color.black);
    	drawHorizontalLine(14, 15, 18, gris);
    	putPixel(16, 18, Color.black);
    	drawHorizontalLine(17, 19, 18, gris);
    	putPixel(20, 18, Color.black);
    	
    	putPixel(2, 19, Color.black);
    	drawHorizontalLine(3, 6, 19, gris);
    	drawHorizontalLine(7, 12, 19, Color.white);
    	putPixel(13, 19, Color.black);
    	drawHorizontalLine(14, 16, 19, gris);
    	drawHorizontalLine(17, 18, 19, Color.black);
    	drawHorizontalLine(19, 20, 19, gris);
    	putPixel(21, 19, Color.black);
    	
    	putPixel(2, 20, Color.black);
    	drawHorizontalLine(3, 5, 20, gris);
    	drawHorizontalLine(6, 9, 20, Color.white);
    	putPixel(10, 20, Color.black);
    	drawHorizontalLine(11, 12, 20, Color.white);
    	putPixel(13, 20, Color.black);
    	drawHorizontalLine(14, 20, 20, gris);
    	putPixel(21, 20, Color.black);
    	
    	putPixel(1, 21, Color.black);
    	drawHorizontalLine(2, 4, 21, gris);
    	drawHorizontalLine(5, 10, 21, Color.white);
    	drawHorizontalLine(11, 12, 21, Color.black);
    	putPixel(13, 21, Color.white);
    	putPixel(14, 21, Color.black);
    	drawHorizontalLine(15, 20, 21, gris);
    	putPixel(21, 21, Color.black);
    	
    	putPixel(1, 22, Color.black);
    	putPixel(2, 22, gris);
    	putPixel(3, 22, Color.black);
    	putPixel(4, 22, gris);
    	drawHorizontalLine(5, 14, 22, Color.white);
    	putPixel(15, 22, Color.black);
    	drawHorizontalLine(16, 20, 22, gris);
    	putPixel(21, 22, Color.black);
    	
    	putPixel(1, 23, Color.black);
    	putPixel(2, 23, gris);
    	putPixel(3, 23, Color.black);
    	drawHorizontalLine(4, 6, 23, Color.white);
    	putPixel(7, 23, gris);
    	drawHorizontalLine(8, 10, 23, Color.white);
    	putPixel(11, 23, gris);
    	drawHorizontalLine(12, 14, 23, Color.white);
    	putPixel(15, 23, gris);
    	drawHorizontalLine(16, 18, 23, Color.black);
    	drawHorizontalLine(19, 20, 23, gris);
    	putPixel(21, 23, Color.black);
    	
    	drawHorizontalLine(1, 2, 24, Color.black);
    	putPixel(3, 24, gris);
    	drawHorizontalLine(4, 5, 24, Color.white);
    	putPixel(6, 24, gris);
    	putPixel(7, 24, Color.white);
    	putPixel(8, 24, gris);
    	putPixel(9, 24, Color.white);
    	putPixel(10, 24, gris);
    	putPixel(11, 24, Color.white);
    	putPixel(12, 24, gris);
    	putPixel(13, 24, Color.white);
    	putPixel(14, 24, gris);
    	putPixel(15, 24, Color.white);
    	putPixel(16, 24, gris);
    	drawHorizontalLine(17, 19, 24, Color.white);
    	putPixel(20, 24, gris);
    	putPixel(21, 24, Color.black);
    	
    	drawHorizontalLine(1, 2, 25, Color.black);
    	putPixel(3, 25, gris);
    	drawHorizontalLine(4, 19, 25, Color.white);
    	putPixel(20, 25, gris);
    	putPixel(21, 25, Color.black);
    	
    	drawHorizontalLine(2, 3, 26, Color.black);
    	drawHorizontalLine(4, 19, 26, Color.white);
    	putPixel(20, 26, Color.black);
    	
    	putPixel(3, 27, Color.black);
    	drawHorizontalLine(4, 19, 27, Color.white);
    	putPixel(20, 27, Color.black);
    	
    	putPixel(4, 28, Color.black);
    	drawHorizontalLine(5, 18, 28, Color.white);
    	putPixel(19, 28, Color.black);
    	
    	putPixel(5, 29, Color.black);
    	drawHorizontalLine(6, 17, 29, Color.white);
    	putPixel(18, 29, Color.black);
    	
    	putPixel(5, 30, Color.black);
    	drawHorizontalLine(6, 9, 30, gris);
    	drawHorizontalLine(10, 13, 30, Color.white);
    	drawHorizontalLine(14, 17, 30, gris);
    	putPixel(18, 30, Color.black);
    	
    	putPixel(6, 31, Color.black);
    	drawHorizontalLine(7, 10, 31, gris);
    	drawHorizontalLine(11, 12, 31, Color.black);
    	drawHorizontalLine(13, 16, 31, gris);
    	putPixel(17, 31, Color.black);
    	
    	drawHorizontalLine(7, 16, 32, Color.black);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);
        

        try {       
            ImageIO.write(image, "jpg", new File("Totoro.jpg"));
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


