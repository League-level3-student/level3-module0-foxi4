package _04_Crazy_Digital_Painting;

import java.awt.Color;

public class CrazyDigitalPainting {
    // 1. Create two final static integers for the width and height of the display.
static final int width = 500;
static final int height = 500;

    // 2. Create a 2D array of Color objects. You will need to import
    //    java.awt.Color. Initialize the size of the array using the 
    //    integers created in step 1.
Color[][] array = new Color[width][height];

    public CrazyDigitalPainting() {
        // 3. Open the crazy_digital_painting.png file and look at the image.

        // 4. Iterate through the 2D array and initialize each Color object
        //    to a new color. The sample image was created using the following 
        //    pattern:
        //    colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
for(int i=0;i<array.length;i++) {
	for(int k=0;k<array[i].length;k++) {
		array[i][k] = new Color(k % 256, (k * i) % 256, i % 256);
		//you can change i and k (stuff before modulo) and the color values. really really cool!
		//changes patterns and colors and all that! :)
		//color values are ALWAYS under 256
	}
}
        // 5. Come up with your own pattern to make a cool crazy image.

        // 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
        //    to show off your picture.
ColorArrayDisplayer.displayColorsAsImage(array);
//can tell a CLASS to run a method, but only if the method is STATIC 
    }

    public static void main(String[] args) {
        new CrazyDigitalPainting();
        
    }
}
