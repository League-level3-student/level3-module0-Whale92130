package _01_Simple_Array_Algorithms;

import java.util.Random;

import org.junit.jupiter.api.Test;



public class MoreArrayFun {
	static String[] things = new String[5];
	
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
		testAll();

	
	}

	  static void testAll() {
		things[0] = "hi";
		things[1] = "hellow";
		things[2] = "Bye";
		things[3] = "weeeee";
		things[4] = "™";
	    
		printy(things);
		printyReverse(things);
		printyEveryOther(things);
		printyRandom(things);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	  static void printy(String[] things) {
		for (int i = 0; i < things.length; i++) {
			System.out.println(things[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	  static void printyReverse(String[] things) {
		for (int i = things.length; i > 0; i--) {
			System.out.println(things[i]);
		}

	}

	 // 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	 static void printyEveryOther(String[] things) {
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
		int varRand =0;
		String[] pastWords = new String[things.length];
		for (int i = 0; i<things.length; i++) {
			varRand=rand.nextInt(things.length);
			for(int o =0; o<pastWords.length; o++) {
				
				String current = things[varRand];
				String current2 = pastWords[o];
				if (current == current2) {
					i=0;
				}
				else {
					System.out.println(things[varRand]);
					things[varRand] = pastWords[i];
				}
			}
		}
	}

}
