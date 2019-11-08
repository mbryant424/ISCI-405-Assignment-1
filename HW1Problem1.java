package Homework;

/**
 * This {@code HM1Problem} class provides methods for manipulating {@code int} for loops.
 * 
 * @author Max Bryant (mbryant3@albany.edu)
 */

// Problem 1
public class HW1Problem1 {
	/**
	 * The main function.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String[] args) {
		//first loop produces times tables up to 9x9, in a simple way
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println((i) + "*" + j + "=" + i * j);
			}
		}
		
		System.out.println();
		
		//second loop produces times tables up to 9x9, in a challenging way
		for(int i = 0; i < 81; i++) {
			 System.out.println((i+9)/9 + "*" + (((i)%9)+1) + "=" + (((i+9)/9)*((i%9)+1)));	
		}
		
		

	}
}
