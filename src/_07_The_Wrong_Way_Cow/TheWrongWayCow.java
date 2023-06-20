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
		int cowHPlus = 0;
		int cowVPlus = 0;
		int cowHMinus = 0;
		int cowVMinus = 0;
		int[] total1 = new int[2];
		int[] total2 = new int[2];
		int[] total3 = new int[2];
		int[] total4 = new int[2];
		int[] total = new int[2];
		for (int i = 0; i < field.length; i++) {
			for (int o = 0; o < field[0].length; o++) {

				// check vertical +
				if (i + 2 <= field.length-1) {
					if (field[i][o] == 'c' && field[i + 1][o] == 'o' && field[i + 2][o] == 'w') {
						total1[1] = i;
						total1[0] = o;
						
						cowVPlus++;
					}
				}
				// check horizontal +
				if (o + 2 <= field[0].length) {

					if (field[i][o] == 'c' && field[i][o + 1] == 'o' && field[i][o + 2] == 'w') {
						total2[1] = i;
						total2[0] = o;
						
						cowHPlus++;
					}
				}

				// check vertical -
				if (i - 2 >= 0) {
					if (field[i][o] == 'c' && field[i - 1][o] == 'o' && field[i - 2][o] == 'w') {
						total3[1] = i;
						total3[0] = o;
						
						cowVMinus++;
					}
				}

				// check horizontal -
				if (o - 2 >= 0) {
				
					if (field[i][o] == 'c' && field[i][o - 1] == 'o' && field[i][o - 2] == 'w') {
						total4[1] = i;
						total4[0] = o;
						
						cowHMinus++;
					}
				}
			
				
				
				
				
			}
		
		}
		// do logic
		System.out.println("cowVPlus = " + cowVPlus);
		System.out.println("cowVMinus = " + cowVMinus);
		System.out.println("cowHPlus = " + cowHPlus);
		System.out.println("cowHMinus = " + cowHMinus);
		if (cowVPlus == 1) {
			total = total1;
			
		} else if (cowVMinus == 1) {
			total = total3;
			
		} else if (cowHPlus == 1) {
			total = total2;

		} else if (cowHMinus == 1) {
			total = total4;

		}
		cowHPlus = 0;
		 cowVPlus = 0;
		 cowHMinus = 0;
		 cowVMinus = 0;
		return total;

	}
}
