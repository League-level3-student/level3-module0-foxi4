package _03_Intro_to_2D_Arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	 int[][] Array2d = new int[3][3];

        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer (random?)
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i=0;i<Array2d.length; i++) {
	for(int k=0; k<Array2d[i].length; k++) {
		Random rand = new Random();
		int random = rand.nextInt(100);
		Array2d[i][k] = random;
		//System.out.println(Array2d[i][k]);
	}
	
	
}
        
        // 3. print the third element from the second 1D array (2DArray[1][2])
//not three cuz arrays are 0,1,2.. yk
System.out.println(Array2d[1][2]);
        // 4. set the third element from the second 1D array to a different
        //    value
Array2d[1][2] = 10; 
        // 5. print the element again and verify the value has changed

System.out.println(Array2d[1][2]);

    }
}
