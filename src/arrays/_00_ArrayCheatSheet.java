package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		int small = Integer.MAX_VALUE;
		int big = Integer.MIN_VALUE;
		//1. make an array of 5 Strings
		String [] s = new String [5];
		//2. print the third element in the array
		System.out.println("Before: " + s [2]);
		//3. set the third element to a different value
		s [2] = "BEEEEEEEPPPPPPPPP!!!!!!";
		//4. print the third element again
		System.out.println("After: " + s [2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		//6. make an array of 50 integers
		int arr50 [] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0 ; i<arr50.length; i++) {
			Random r = new Random();
			arr50[i] = r.nextInt(200);
		}
		for(int i = 0; i<arr50.length; i++) {
			if(arr50[i] < small) {
				small = arr50[i];
			}
		}
		System.out.println("Smallest: " + small);
		
		for(int i = 0; i<arr50.length; i++) {
			if(arr50[i] > big) {
				big = arr50[i];
			}
		}
		System.out.println("Biggest: " + big);
		for(int i = 0; i<arr50.length; i++) {
			System.out.println(arr50 [i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
