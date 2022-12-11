/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
       
        int UpWay = 0;
        int DownWay = 0;
        int LeftWay = 0;
        int RightWay = 0;
        int UpX = 0;
        int UpY = 0;
        int DownX = 0;
        int DownY = 0;
        int LeftX = 0;
        int LeftY = 0;
        int RightX = 0;
        int RightY = 0;
        for (int i = 0; i < field.length; i++) {
        	for(int k = 0; k<field[i].length; k++) {
        		 if(field[i][k] == 'c') {
        			 if(k-1>=0 && field[i][k-1]=='o') {
        				 
        				 if(field[i][k-2]=='w') {
        				 UpWay +=1;
        				 UpX = i;
        				 UpY = k;
        				 } 
        			 }
        			 if(k+1<field.length &&field[i][k+1]=='o') {
        				 if(field[i][k+2]=='w') {
        					 DownWay +=1;
        					 DownX=i;
        					 DownY=k;
        				 }
        			 }
                	if(i-1>=0 && field[i-1][k]=='o') {
                		if(field[i-2][k]=='w') {
                			RightWay +=1;
                			RightX =i;
                			RightY =k;
                		}
                	}
                	 if(i+1<field.length && field[i+1][k] == 'o') {
                		 
                		 if(field[i+2][k]=='w') {
                			 LeftWay +=1;	
                			 LeftX=i;
                			 LeftY=k;
                		 }
                	 }
                	 
        		 }
         }
        }
        if(UpWay == 1) {
        	return new int[] {UpX,UpY};
        	//how to return a new array with certain variables
        }
        if(DownWay == 1) {
        	return new int[] {DownX,DownY};

        }
        if(LeftWay == 1) {
        	return new int[] {LeftX,LeftY};

}
        if(RightWay == 1) {
        	return new int[] {RightX,RightY};

}
       
        
        return null;
        //needs return null (to have some type of return), but in theory it will not get to return null
        //cuz there are returns before
    }
}
