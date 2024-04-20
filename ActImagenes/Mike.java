package actividad;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Mike {
	static int width = 1240;
    static int height = 1440;
    
    static Color verde = new Color(180,207,90);
    static Color verde2 = new Color(69,85,38);
    static Color azul = new Color(177,221,255);
    
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
    	drawVerticalLine(1, 16, 8, verde);
    	drawVerticalLine(1, 17, 21, verde);
    	drawVerticalLine(2, 3, 9, verde2);
    	drawVerticalLine(2, 3, 21, verde2);
    	drawVerticalLine(4, 16, 9, verde);
    	drawHorizontalLine(12, 17, 2, verde);
    	drawHorizontalLine(10, 18, 3, verde);
    	drawVerticalLine(2, 18, 20, verde);
    	drawHorizontalLine(8, 21, 4, verde);
    	drawHorizontalLine(8, 22, 5, verde);
    	drawHorizontalLine(7, 22, 6, verde);
    	drawHorizontalLine(7, 23, 7, verde);
    	drawHorizontalLine(6, 23, 8, verde);
    	drawHorizontalLine(7, 24, 9, verde);
    	putPixel(7, 8, verde2);
    	drawHorizontalLine(5, 25, 10, verde);
    	drawHorizontalLine(4, 26, 11, verde);
    	drawHorizontalLine(6, 26, 12, verde);
    	drawHorizontalLine(7, 27, 13, verde);
    	drawHorizontalLine(7, 26, 14, verde);
    	drawHorizontalLine(7, 25, 15, verde);
    	drawHorizontalLine(8, 24, 16, verde);
    	drawHorizontalLine(10, 23, 17, verde);
    	drawHorizontalLine(12, 20, 18, verde);
    	drawVerticalLine(15, 33, 2, verde);
    	drawVerticalLine(22, 32, 1, verde);
    	drawVerticalLine(19, 22, 3, verde);
    	drawVerticalLine(29, 34, 3, verde);
    	drawVerticalLine(31, 33, 4, verde);
    	drawVerticalLine(20, 23, 2, verde2);
    	drawVerticalLine(30, 31, 3, verde);
    	putPixel(4, 30, verde2);
    	drawVerticalLine(24, 35, 7, verde);
    	putPixel(8, 35, verde);
    	drawVerticalLine(17, 34, 8, verde2);
    	drawVerticalLine(14, 33, 28, verde);
    	drawVerticalLine(19, 22, 27, verde);
    	drawVerticalLine(29, 34, 27, verde);
    	drawVerticalLine(31, 33, 26, verde);
    	drawVerticalLine(22, 32, 29, verde);
    	drawVerticalLine(20, 23, 28, verde2);
    	drawVerticalLine(30, 31, 27, verde2);
    	putPixel(26, 30, verde2);
    	drawVerticalLine(25, 35, 22, verde);
    	drawVerticalLine(18, 35, 21, verde2);
    	drawVerticalLine(9, 11, 6, verde2);
    	drawVerticalLine(11, 20, 5, verde2);
    	drawVerticalLine(12, 18, 4, verde2);
    	drawVerticalLine(13, 18, 3, verde2);
    	drawVerticalLine(13, 21, 6, verde2);
    	drawVerticalLine(16, 23, 7, verde2);
    	drawVerticalLine(15, 20, 26, verde2);
    	drawVerticalLine(16, 21, 25, verde2);
    	drawVerticalLine(17, 22, 24, verde2);
    	drawVerticalLine(18, 23, 23, verde2);
    	drawVerticalLine(18, 24, 22, verde2);
    	drawVerticalLine(14, 18, 27, verde2);
    	drawVerticalLine(17, 24, 9, verde2);
    	drawVerticalLine(30, 31, 3, verde2);
    	drawHorizontalLine(10, 11, 18, verde2);
    	drawHorizontalLine(10, 20, 19, verde2);
    	drawHorizontalLine(10, 20, 20, verde2);
    	drawHorizontalLine(10, 20, 21, verde2);
    	drawHorizontalLine(10, 20, 22, verde2);
    	drawHorizontalLine(10, 20, 23, verde2);
    	drawHorizontalLine(10, 20, 24, verde2);
    	drawHorizontalLine(11, 19, 25, verde2);
    	drawHorizontalLine(11, 19, 16, verde2);
    	drawHorizontalLine(11, 14, 7, Color.white);
    	drawHorizontalLine(11, 14, 8, Color.white);
    	drawHorizontalLine(12, 13, 9, Color.white);
    	drawHorizontalLine(16, 19, 7, Color.white);
    	drawHorizontalLine(16, 19, 8, Color.white);
    	drawHorizontalLine(17, 18, 9, Color.white);
    	drawHorizontalLine(12, 13, 7, verde2);
    	drawHorizontalLine(12, 13, 8, verde2);
    	drawHorizontalLine(17, 18, 7, verde2);
    	drawHorizontalLine(17, 18, 8, verde2);
    	drawHorizontalLine(14, 16, 10, verde2);
    	drawHorizontalLine(13, 17, 11, verde2);
    	drawHorizontalLine(14, 16, 12, verde2);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);
        

        try {       
            ImageIO.write(image, "jpg", new File("Mike.jpg"));
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
