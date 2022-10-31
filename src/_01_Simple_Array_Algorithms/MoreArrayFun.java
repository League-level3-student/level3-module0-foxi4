package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

//written at bottom of code

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

public static void printStrings(String[] array) {
	for(int i=0; i<array.length; i++) {
		System.out.print(array[i]);
	}
	
}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

public static void printReverse(String[] array) {
	for(int i= array.length-1; i>=0; i--) {
		
		System.out.print(array[i]);
	}
}

    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.

	public static void main(String[] args) {
		
		String[] array = new String[5];
		array[0] = "yo";
		array[1] = "wassup";
		array[2] = "my";
		array[3] = "good";
		array[4] = "friend";
		
		printStrings(array);
		System.out.print("\n");
		printReverse(array);
	}
}
