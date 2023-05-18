package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] things = new String[5];
		things[0] = "hi";
		things[1] = "hellow";
		things[2] = "Bye";
		things[3] = "weeeee";
		things[4] = "™";

		printyRandom(things);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void printy(String[] things) {
		for (int i = 0; i < things.length; i++) {
			System.out.println(things[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void printyReverse(String[] things) {
		for (int i = things.length; i > 0; i--) {
			System.out.println(things[i]);
		}

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void printyEveryOther(String[] things) {
		for (int i = 0; i < things.length; i++) {
			if (i % 2 == 0) {
				System.out.println(things[i]);
			}
		}

	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void printyRandom(String[] things) {
		Random rand = new Random();
		for (int i = 0; i < things.length; i++) {
			int random = 
			
			int printer = rand.nextInt(things.length);
			System.out.println(things[printer]);

		}
	}

}
