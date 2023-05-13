package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] fruits = new String[5];
		fruits[0] = "appple";
		fruits[1] = "banana";
		fruits[2] = "lemon";
		fruits[3] = "watermelon";
		fruits[4] = "orange";

		// 2. print the third element in the array
		System.out.println(fruits[2]);
		// 3. set the third element to a different value
		fruits[2] = "lime";
		// 4. print the third element again
		System.out.println(fruits[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for(int i = 0; i<fruits.length; i++) {
			fruits[i] = "tomato";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int o = 0; o<fruits.length; o++) {
			System.out.println(fruits[o]);
		}
		// 7. make an array of 50 integers
		int[] nums = new int[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		 Random random = new Random();
		for(int i = 0; i<nums.length; i++) {
			int rand = random.nextInt(50);
			nums[i] = rand;
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		int smallNum = nums[0];
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]<smallNum) {
				smallNum = nums[i];
			}
		}
		System.out.println("The smallest number is " + smallNum);
		// 10 print the entire array to see if step 8 was correct
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("\n");
		// 11. print the largest number in the array.
		int largeNum = nums[0];
		for(int l = 0; l<nums.length; l++) {
			if(nums[l]>largeNum) {
				largeNum = nums[l];
			}
		}
		System.out.println("The largest number is "+largeNum);
		System.out.println("\n");
		// 12. print only the last element in the array
		System.out.println(nums[nums.length-1]);
	}
}
