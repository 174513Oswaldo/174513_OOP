package actividad;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class UnCapibara {
	static int width = 1040;
    static int height = 1200;
    
    static Color verde = new Color(114,204,127);
    static Color luz = new Color(230,200,140);
    static Color cafe1 = new Color(175,134,98);
    static Color cafe2 = new Color(109,78,50);
    static Color naranja = new Color(214,122,20);
    
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
    	drawBackground(PIXEL_SIZE, verde); 
    	putPixel(6, 1, Color.white);
    	putPixel(11, 1, Color.white);
    	drawHorizontalLine(14, 16, 1, Color.black);
    	
    	putPixel(13, 2, Color.black);
    	drawHorizontalLine(14, 16, 2, naranja);
    	putPixel(17, 2, Color.black);
    	putPixel(21, 2, Color.white);
    	
    	putPixel(12, 3, Color.black);
    	putPixel(13, 3, naranja);
    	putPixel(14, 3, luz);
    	drawHorizontalLine(15, 17, 3, naranja);
     	putPixel(18, 3, Color.black);
     	
     	putPixel(12, 4, Color.black);
    	putPixel(13, 4, naranja);
    	putPixel(14, 4, luz);
    	drawHorizontalLine(15, 17, 4, naranja);
     	putPixel(18, 4, Color.black);
     	
     	putPixel(2, 5, Color.white);
    	putPixel(13, 5, Color.black);
     	drawHorizontalLine(14, 16, 5, naranja);
    	putPixel(17, 5, Color.black);
    	putPixel(23, 5, Color.white);
     	
    	drawHorizontalLine(14, 16, 6, Color.black);
    	
    	putPixel(8, 7, Color.white);
    	putPixel(13, 7, Color.black);
     	drawHorizontalLine(14, 16, 7, naranja);
    	putPixel(17, 7, Color.black);
    	putPixel(19, 7, Color.white);
    	
    	putPixel(12, 8, Color.black);
    	putPixel(13, 8, naranja);
    	putPixel(14, 8, luz);
    	drawHorizontalLine(15, 17, 8, naranja);
     	putPixel(18, 8, Color.black);
     	drawHorizontalLine(20, 22, 8, Color.black);
     	
     	putPixel(2, 9, Color.white);
     	putPixel(12, 9, Color.black);
    	putPixel(13, 9, naranja);
    	putPixel(14, 9, luz);
    	drawHorizontalLine(15, 17, 9, naranja);
    	drawHorizontalLine(18, 19, 9, Color.black);
    	drawHorizontalLine(20, 21, 9, cafe2);
    	putPixel(22, 9, Color.black);
    	putPixel(25, 9, Color.white);
    	
    	drawHorizontalLine(9, 13, 10, Color.black);
    	drawHorizontalLine(14, 16, 10, naranja);
    	drawHorizontalLine(17, 18, 10, Color.black);
    	drawHorizontalLine(19, 21, 10, cafe2);
    	putPixel(22, 10, Color.black);
     	
    	drawHorizontalLine(7, 8, 11, Color.black);
    	putPixel(9, 11, cafe2);
    	drawHorizontalLine(10, 13, 11, cafe1);
    	drawHorizontalLine(14, 16, 11, Color.black);
    	drawHorizontalLine(17, 20, 11, cafe2);
    	putPixel(21, 11, Color.black);
    	
    	putPixel(6, 12, Color.black);
    	drawHorizontalLine(7, 9, 12, cafe2);
    	drawHorizontalLine(10, 19, 12, cafe1);
    	putPixel(20, 12, Color.black);
    	
    	drawHorizontalLine(2, 3, 13, Color.white);
    	putPixel(6, 13, Color.black);
    	putPixel(7, 13, cafe2);
    	drawHorizontalLine(8, 9, 13, Color.black);
    	putPixel(10, 13, cafe2);
    	drawHorizontalLine(11, 19, 13, cafe1);
    	putPixel(20, 13, Color.black);
    	
    	putPixel(6, 14, Color.black);
    	putPixel(7, 14, cafe2);
    	putPixel(8, 14, Color.black);
    	drawHorizontalLine(9, 10, 14, cafe2);
    	drawHorizontalLine(11, 14, 14, cafe1);
    	drawHorizontalLine(15, 17, 14, Color.black);
    	drawHorizontalLine(18, 19, 14, cafe1);
    	putPixel(20, 14, cafe2);
    	putPixel(21, 14, Color.black);
    	
    	putPixel(6, 15, Color.black);
    	putPixel(7, 15, cafe2);
    	putPixel(8, 15, Color.black);
    	drawHorizontalLine(9, 10, 15, cafe2);
    	drawHorizontalLine(11, 14, 15, cafe1);
    	drawHorizontalLine(15, 16, 15, Color.black);
    	drawHorizontalLine(17, 20, 15, cafe1);
    	putPixel(21, 15, Color.black);
    	drawHorizontalLine(23, 24, 15, Color.white);
    	
    	drawHorizontalLine(5, 6, 16, Color.black);
    	putPixel(7, 16, cafe2);
    	putPixel(8, 16, Color.black);
    	drawHorizontalLine(9, 10, 16, cafe2);
    	drawHorizontalLine(11, 17, 16, cafe1);
    	putPixel(18, 16, cafe2);
    	drawHorizontalLine(19, 20, 16, cafe1);
    	putPixel(21, 16, cafe2);
    	putPixel(22, 16, Color.black);
    	
    	putPixel(4, 17, Color.black);
    	drawHorizontalLine(5, 6, 17, cafe1);
    	putPixel(7, 17, Color.black);
    	putPixel(8, 17, cafe2);
    	putPixel(9, 17, Color.black);
    	putPixel(10, 17, cafe2);
    	drawHorizontalLine(11, 21, 17, cafe1);
    	putPixel(22, 17, Color.black);
    	
    	putPixel(3, 18, Color.black);
    	drawHorizontalLine(4, 7, 18, cafe1);
    	putPixel(8, 18, Color.black);
    	drawHorizontalLine(9, 10, 18, cafe2);
    	drawHorizontalLine(11,21, 18, cafe1);
    	putPixel(22, 18, cafe2);
    	putPixel(23, 18, Color.black);
    	
    	putPixel(3, 19, Color.black);
    	drawHorizontalLine(4, 8, 19, cafe1);
    	drawHorizontalLine(9, 12, 19, Color.black);
    	drawHorizontalLine(13, 14, 19, cafe2);
    	drawHorizontalLine(15, 21, 19, cafe1);
    	putPixel(22, 19, cafe2);
    	putPixel(23, 19, Color.black);
    	
    	putPixel(0, 20, Color.white);
    	putPixel(2, 20, Color.black);
    	drawHorizontalLine(3, 14, 20, cafe1);
    	putPixel(15, 20, cafe2);
    	drawHorizontalLine(16, 21, 20, cafe1);
    	putPixel(22, 20, cafe2);
    	putPixel(23, 20, Color.black);
    	putPixel(24, 20, Color.white);
    	
    	drawHorizontalLine(0, 1, 21, Color.white);
    	putPixel(2, 21, Color.black);
    	drawHorizontalLine(3, 21, 21, cafe1);
    	putPixel(22, 21, cafe2);
    	putPixel(23, 21, Color.black);
    	
    	putPixel(2, 22, Color.black);
    	drawHorizontalLine(3, 6, 22, cafe1);
    	drawHorizontalLine(7, 8, 22, cafe2);
    	drawHorizontalLine(9, 21, 22, cafe1);
    	putPixel(22, 22, Color.black);
    	
    	putPixel(2, 23, Color.black);
    	drawHorizontalLine(3, 8, 23, cafe1);
    	putPixel(9, 23, cafe2);
    	drawHorizontalLine(10, 21, 23, cafe1);
    	putPixel(22, 23, Color.black);
    	
    	putPixel(2, 24, Color.black);
    	putPixel(3, 24, cafe2);
    	drawHorizontalLine(4, 8, 24, cafe1);
    	putPixel(9, 24, cafe2);
    	drawHorizontalLine(10, 21, 24, cafe1);
    	putPixel(22, 24, Color.black);
    	putPixel(25, 24, Color.white);
    	
    	putPixel(3, 25, Color.black);
    	drawHorizontalLine(4, 7, 25, cafe1);
    	drawHorizontalLine(8, 9, 25, cafe2);
    	drawHorizontalLine(10, 13, 25, cafe1);
    	putPixel(14, 25, cafe2);
    	putPixel(15, 25, Color.black);
    	putPixel(16, 25, cafe1);
    	putPixel(17, 25, Color.black);
    	putPixel(18, 25, cafe2);
    	drawHorizontalLine(19, 20, 25, cafe1);
    	putPixel(21, 25, Color.black);
    	drawHorizontalLine(24, 25, 25, Color.white);
    	
    	drawHorizontalLine(3, 4, 26, Color.black);
    	drawHorizontalLine(5, 6, 26, cafe1);
    	drawHorizontalLine(7, 8, 26, cafe2);
    	drawHorizontalLine(9, 10, 26, Color.black);
    	putPixel(11, 26, cafe1);
    	drawHorizontalLine(12, 15, 26, cafe2);
    	putPixel(16, 26, Color.black);
    	drawHorizontalLine(17, 19, 26, cafe2);
    	drawHorizontalLine(20, 21, 26, Color.black);
    	putPixel(25, 26, Color.white);
    	
    	drawHorizontalLine(4, 5, 27, Color.black);
    	drawHorizontalLine(6, 9, 27, cafe2);
    	drawHorizontalLine(10,11, 27, Color.black);
    	drawHorizontalLine(12, 15, 27, cafe2);
    	putPixel(16, 27, Color.black);
    	drawHorizontalLine(17, 18, 27, cafe2);
    	drawHorizontalLine(19, 20, 27, Color.black);
    	
    	drawHorizontalLine(1, 2, 28, Color.white);
    	drawHorizontalLine(6, 18, 28, Color.black);
    	drawHorizontalLine(21, 22, 28, Color.white);
    	
    	drawHorizontalLine(0, 3, 29, Color.white);
    	drawHorizontalLine(20, 23, 29, Color.white);
    	
        drawSquareGrid(PIXEL_SIZE, Color.black);
        

        try {       
            ImageIO.write(image, "jpg", new File("Capibara.jpg"));
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

