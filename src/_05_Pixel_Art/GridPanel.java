package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class GridPanel extends JPanel{

    private static final long serialVersionUID = 1L;
    private int windowWidth;
    private int windowHeight;
    private int pixelWidth;
    private int pixelHeight;
    private int rows;
    private int cols;

    // 1. Create a 2D array of pixels. Do not initialize it yet.
Pixel[][] pixel;
    private Color color;

    public GridPanel(int w, int h, int r, int c) {
        this.windowWidth = w;
        this.windowHeight = h;
        this.rows = r;
        this.cols = c;

        this.pixelWidth = windowWidth / cols;
        this.pixelHeight = windowHeight / rows;

        color = Color.BLACK;
        setPreferredSize(new Dimension(windowWidth, windowHeight));

        // 2. Initialize the pixel array using the rows and cols variables.
pixel = new Pixel[rows][cols];

        // 3. Iterate through the array and initialize each element to a new pixel.

for(int i=0; i<pixel.length;i++) {
	for(int k=0;k<pixel[i].length;k++) {
		pixel[i][k] = new Pixel(i, k); 
		
	}
}

    }

    public void setColor(Color c) {
        color = c;
        //anything Color c is the variable color is
    }

    public void clickPixel(int mouseX, int mouseY) {
        // 5. Use the mouseX and mouseY variables to change the color
        //    of the pixel that was clicked. *HINT* Use the pixel's dimensions.
    	Pixel pixelColor = pixel[mouseY/pixelHeight][mouseX/pixelWidth];
    	//x and y are flipped in 2d arrays
    	pixelColor.color = color;
    			//not new pixels cuz we're using an already created pixel. want to have the same
    			//pixel be called
    	//overcomplicated vers. below
//    	 for(int i = 0; i<pixel.length;i++) {
//    		for(int k=0; k<pixel[i].length;k++) {
//    			int x = i % pixelWidth;
//    	    	int y = (i - x) / pixelWidth;
//    	  
//    	    	if(mouseX == x && mouseY == y) {
//    	    		Random rand = new Random();
//    	    		int random = rand.nextInt(255);
//    	    		int r = random;
//    	    		int g = random;
//    	    		int b = random;
//    	    		Color colr = new Color(r,g,b);
//    	    		setColor(colr);
//    	    		
//    	    		}
//    		}
//    	}
    	//highlight, command +/ to comment out everything highlighted
    	
    	
      }

    @Override
    public void paintComponent(Graphics g) {
        // 4. Iterate through the array.
        //    For every pixel in the list, fill in a rectangle using the pixel's color.
        //    Then, use drawRect to add a grid pattern to your display.
    	for(int i=0; i<pixel.length;i++) { //first for loop represents rows/vertical
    		for(int k=0;k<pixel[i].length;k++) { //second for loop represents columns/horizontal
    			//drawRect(int x, int y, int width, int height)
    			
    			g.setColor(pixel[i][k].color);
    			g.fillRect(k*pixelWidth,i*pixelHeight,pixelWidth,pixelHeight);
    			g.setColor(Color.black);
    			g.drawRect(k*pixelWidth,i*pixelHeight,pixelWidth,pixelHeight);
    			
    			
    			//g.fillRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    			
    		}
    	}
    }
}
