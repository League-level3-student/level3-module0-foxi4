package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
	
    public static int sumIntArray(int[] values) {
    	int sum = 0;	
    for (int i = 0; i < values.length; i++) {
	   sum += values[i];
	   //every time loop loops, i (0,1,2,3,etc.) is added to the sum. 
	   //return sum;
   }    
    return sum;
    //not sure if this is what to return??
    }


    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
int average = 0;
//do the sum thing again but make it divided by the length of values
for (int i = 0; i < values.length; i++) {
	   average += values[i]/values.length;
}
        return average;
    }
    	
		
	


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
for(int i=0; i<array.length; i++) {
    	if(array[i]==value) {
    		return true;
    	}	
 //dont put a return false because if the first time is false the loop will end and
   //will output false
}
return false;
}

    

    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	for(int i=0; i<arr.length; i++) {
        	if(arr[i]==value) {
        		return i;
        	}	
    }
    	return -1;
    }
    public static void main(String[] args) {
		int[] values = {1,2,3,4,5,6,7,8,9};
		int parameter = 5;
		System.out.print("Sum of the integers: " + sumIntArray(values) + "\n");
		System.out.print("Average of all the integers: " + averageIntArray(values) +"\n");
		System.out.print("hi this is "+ containsIntValue(values, parameter) + " \n");
		System.out.print(getIndex(values, parameter));
		//has to be restaten cuz there is no array (we have to make the value)
	}
}
