package _00_Intro_To_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] strArray = new String[5];
strArray[0] = "hi";
strArray[1] = "how";
strArray[2] = "are";
strArray[3] = "you";
strArray[4] = "?";
        // 2. print the third element in the array
System.out.println(strArray[3]);
        // 3. set the third element to a different value
strArray[3] = "me";
        // 4. print the third element again
System.out.println(strArray[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for(int i = 0; i<strArray.length;i++) {
strArray[i] = "a string";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i = 0; i<strArray.length;i++) {
	System.out.println(strArray[i]);
}
//EVERYTHING ABOVE WORKS!!!!!!!!!!!!!!!!

        // 7. make an array of 50 integers
Integer[] intArray = new Integer[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random rand = new Random();
for(int i=0;i<intArray.length;i++) {
	intArray[i] = rand.nextInt();
	System.out.println(intArray[i]);
}

Arrays.sort(intArray);
System.out.println("Minimum = " + intArray[0]);
System.out.println("Maximum = " + intArray[intArray.length-1]);
System.out.println(intArray[49]);

        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
