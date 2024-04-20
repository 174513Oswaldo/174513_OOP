package actividad;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UnaImagen {
	static int width = 1160;
    static int height = 1200;
    
    static Color verde = new Color(143,166,66);
    static Color verde2 = new Color(54,125,7);
    static Color cafe = new Color(185,138,95);
    static Color cafe2 = new Color(82,52,40);
    
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
    	drawHorizontalLine(9, 13, 0, verde2);
    	drawHorizontalLine(22, 25, 0, verde2);
    	drawHorizontalLine(8, 14, 1, verde2);
    	drawHorizontalLine(21, 26, 1, verde2);
    	drawHorizontalLine(7, 27, 2, verde2);
    	drawHorizontalLine(7, 27, 3, verde2);
    	drawHorizontalLine(7, 27, 4, verde2);
    	drawHorizontalLine(7, 27, 5, verde2);
    	drawHorizontalLine(8, 26, 6, verde2);
    	drawHorizontalLine(8, 27, 7, verde2);
    	drawHorizontalLine(7, 28, 8, verde2);
    	drawHorizontalLine(7, 28, 9, verde2);
    	drawHorizontalLine(7, 28, 10, verde2);
    	drawHorizontalLine(7, 28, 11, verde2);
    	drawHorizontalLine(6, 28, 12, verde2);
    	drawHorizontalLine(6, 28, 13, verde2);
    	drawHorizontalLine(6, 28, 14, verde2);
    	drawHorizontalLine(6, 27, 15, verde2);
    	drawHorizontalLine(7, 27, 16, verde2);
    	drawHorizontalLine(7, 27, 17, verde2);
    	drawHorizontalLine(8, 26, 18, verde2);
    	drawHorizontalLine(8, 25, 19, verde2);
    	drawHorizontalLine(9, 24, 20, verde2);
    	drawHorizontalLine(11, 23, 21, verde2);
    	drawHorizontalLine(14, 17, 22, verde2);
    	drawHorizontalLine(9, 13, 1, verde);
    	drawHorizontalLine(22, 25, 1, verde);
    	drawHorizontalLine(8, 14, 2, verde);
    	drawHorizontalLine(21, 26, 2, verde);
    	drawHorizontalLine(8, 26, 3, verde);
    	drawHorizontalLine(8, 26, 4, verde);
    	drawHorizontalLine(8, 26, 5, verde);
    	drawHorizontalLine(9, 25, 6, verde);
    	drawHorizontalLine(9, 26, 7, verde);
    	drawHorizontalLine(8, 27, 8, verde);
    	drawHorizontalLine(8, 27, 9, verde);
    	drawHorizontalLine(8, 27, 10, verde);
    	drawHorizontalLine(8, 27, 11, verde);
    	drawHorizontalLine(7, 27, 12, verde);
    	drawHorizontalLine(7, 27, 13, verde);
    	drawHorizontalLine(7, 27, 14, verde);
    	drawHorizontalLine(7, 26, 15, verde);
    	drawHorizontalLine(8, 26, 16, verde);
    	drawHorizontalLine(8, 26, 17, verde);
    	drawHorizontalLine(9, 25, 18, verde);
    	drawHorizontalLine(10, 24, 19, verde);
    	drawHorizontalLine(11, 22, 20, verde);
    	drawHorizontalLine(14, 17, 21, verde);
    	putPixel(16, 6, verde2);
    	putPixel(19, 6, verde2);
    	drawHorizontalLine(14, 20, 8, verde2);
    	drawHorizontalLine(13, 21, 9, verde2);
    	drawHorizontalLine(12, 22, 10, verde2);
    	drawHorizontalLine(11, 23, 11, verde2);
    	drawHorizontalLine(11, 23, 12, verde2);
    	drawHorizontalLine(11, 24, 13, verde2);
    	drawHorizontalLine(11, 24, 14, verde2);
    	drawHorizontalLine(11, 24, 15, verde2);
    	drawHorizontalLine(11, 24, 16, verde2);
    	drawHorizontalLine(11, 24, 17, verde2);
    	drawHorizontalLine(12, 23, 18, verde2);
    	drawHorizontalLine(13, 22, 19, verde2);
    	drawHorizontalLine(15, 18, 20, verde2);
    	putPixel(2, 8, cafe2);
    	drawHorizontalLine(1, 2, 9, cafe2);
    	drawHorizontalLine(14, 20, 9, cafe2);
    	drawHorizontalLine(1, 3, 10, cafe2);
    	drawHorizontalLine(13, 21, 10, cafe2);
    	drawHorizontalLine(1, 4, 11, cafe2);
    	drawHorizontalLine(2, 5, 12, cafe2);
    	drawHorizontalLine(2, 5, 13, cafe2);
    	drawHorizontalLine(2, 5, 14, cafe2);
    	drawHorizontalLine(2, 5, 15, cafe2);
    	drawHorizontalLine(1, 6, 16, cafe2);
    	drawHorizontalLine(1, 6, 17, cafe2);
    	drawHorizontalLine(1, 7, 18, cafe2);
    	drawHorizontalLine(0, 7, 19, cafe2);
    	drawHorizontalLine(0, 6, 20, cafe2);
    	drawHorizontalLine(1, 6, 21, cafe2);
    	drawHorizontalLine(1, 5, 22, cafe2);
    	drawVerticalLine(22, 24, 23, cafe2);
    	drawHorizontalLine(1, 23, 23, cafe2);
    	drawHorizontalLine(1, 23, 24, cafe2);
    	drawHorizontalLine(0, 24, 25, cafe2);
    	drawHorizontalLine(0, 24, 26, cafe2);
    	drawHorizontalLine(1, 23, 27, cafe2);
    	drawHorizontalLine(1, 19, 28, cafe2);
    	drawHorizontalLine(2, 18, 29, cafe2);
    	drawHorizontalLine(12, 14, 11, cafe2);
    	drawHorizontalLine(12, 14, 12, cafe2);
    	drawVerticalLine(13, 15, 12, cafe2);
    	drawHorizontalLine(20, 22, 11, cafe2);
    	putPixel(22, 12, cafe2);
    	drawVerticalLine(13, 14, 23, cafe2);
    	drawHorizontalLine(10, 12, 2, Color.white);
    	drawHorizontalLine(22, 25, 2, Color.white);
    	drawHorizontalLine(9, 13, 3, Color.white);
    	drawHorizontalLine(21, 25, 3, Color.white);
    	drawHorizontalLine(10, 13, 4, Color.white);
    	drawHorizontalLine(21, 25, 4, Color.white);
    	drawHorizontalLine(11, 12, 5, Color.white);
    	drawHorizontalLine(22, 24, 5, Color.white);
    	drawHorizontalLine(10, 12, 3, Color.black);
    	drawHorizontalLine(22, 24, 3, Color.black);
    	drawHorizontalLine(11, 12, 4, Color.black);
    	drawHorizontalLine(22, 23, 4, Color.black);
    	drawHorizontalLine(15, 19, 11, cafe);
    	drawHorizontalLine(15, 21, 12, cafe);
    	drawHorizontalLine(13, 22, 13, cafe);
    	drawHorizontalLine(13, 22, 14, cafe);
    	drawHorizontalLine(13, 23, 15, cafe);
    	drawHorizontalLine(12, 23, 16, cafe);
    	drawVerticalLine(17, 18, 13, Color.white);
    	drawVerticalLine(16, 18, 14, Color.white);
    	drawVerticalLine(16, 19, 15, Color.white);
    	drawVerticalLine(13, 19, 16, Color.white);
    	drawVerticalLine(10, 19, 17, Color.white);
    	drawVerticalLine(9, 19, 18, Color.white);
    	drawVerticalLine(13, 19, 19, Color.white);
    	drawVerticalLine(16, 19, 20, Color.white);
    	drawVerticalLine(16, 19, 21, Color.white);
    	drawVerticalLine(16, 18, 22, Color.white);
    	putPixel(23, 17, Color.white);
    	putPixel(12, 17, cafe);
    	putPixel(18, 17, cafe);
    	drawHorizontalLine(14, 15, 14, Color.black);
    	drawHorizontalLine(14, 15, 15, Color.black);
    	drawHorizontalLine(20, 21, 14, Color.black);
    	drawHorizontalLine(20, 21, 15, Color.black);
    	drawVerticalLine(17, 28, 2, Color.white);
    	drawVerticalLine(25, 26, 1, Color.white);
    	drawVerticalLine(19, 28, 3, Color.white);
    	drawVerticalLine(20, 27, 4, Color.white);
    	putPixel(1, 19, Color.white);
    	drawHorizontalLine(4, 22, 23, Color.white);
    	drawHorizontalLine(18, 22, 22, Color.white);
    	drawHorizontalLine(4, 22, 24, Color.white);
    	drawHorizontalLine(20, 23, 25, Color.white);
    	drawHorizontalLine(21, 23, 26, Color.white);
    	drawHorizontalLine(4, 18, 25, Color.white);
    	drawHorizontalLine(14, 18, 26, Color.white);
    	drawHorizontalLine(15, 18, 27, Color.white);
    	drawHorizontalLine(16, 18, 28, Color.white);
    	drawHorizontalLine(6, 13, 27, Color.white);
    	drawHorizontalLine(5, 14, 28, Color.white);
    	drawHorizontalLine(4, 15, 29, Color.white);
    	drawHorizontalLine(7, 8, 20, cafe);
    	drawHorizontalLine(7, 10, 21, cafe);
    	drawHorizontalLine(6, 13, 22, cafe);
    	drawHorizontalLine(7, 14, 23, cafe);
  
        drawSquareGrid(PIXEL_SIZE, Color.black);

        
        try {       
            ImageIO.write(image, "jpg", new File("Gato.jpg"));
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

