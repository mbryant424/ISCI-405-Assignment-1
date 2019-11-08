package Homework;

/**
 * This {@code IntArrays} class provides methods for manipulating {@code int} arrays.
 * 
 * @author Max Bryant (mbryant3@albany.edu)
 */
public class IntArrays {

	/**
	 * Returns a string representation of the contents of the specified array.
	 * 
	 * @param a
	 *            an {@code int} array.
	 * @return a string representation of the contents of the specified array
	 */
	// Problem 2
	public static String toString(int[] a) {
		//null case
		if (a == null) {
			return "()";
		}
		String answer = "(";
		
		//loop through array
		for (int i = 0; i < a.length; i++) {
			if (i != (a.length-1)) {
				answer = answer + a[i] + ", ";
			}
			else {
				answer = answer + a[i];
			}
		}
		return answer = answer + ")";
	}

	/**
	 * Determines whether or not the specified arrays have the same contents.
	 * 
	 * @param a1
	 *            an {@code int} array.
	 * @param a2
	 *            an {@code int} array.
	 * @return {@code true} if the specified arrays are of the same length and have the same elements; {@code false}
	 *         otherwise.
	 */
	// Problem 3
	public static boolean compare(int[] a1, int[] a2) {
		//null case
		if (a1 == null && a2 == null) {
			return true;
		}
		else if (a1 == null || a2 == null) {
			return false;
		}
		
		//check if lengths are the same for each array
		if (a1.length != a2.length) {
			return false;
		}
		
		//loop through array to check if the elements are the same at each index
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the concatenation of the two specified arrays.
	 * 
	 * @param a1
	 *            an {@code int} array.
	 * @param a2
	 *            an {@code int} array.
	 * @return an array that corresponds to the concatenation of the two specified arrays.
	 */
	// Problem 4
	public static int[] concatenate(int[] a1, int[] a2) {
		//null case
		if (a1 == null && a2 == null) {
			return null;
		}
		else if (a1 == null) {
			return a2;
		}
		else if (a2 == null) {
			return a1;
		}
		
		// create new array with size a1 length plus a2 length
		int[] a3 = new int [a1.length + a2.length];
		
		//loop through a1
		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}
		//loop through a2
		for (int i = 0; i < a2.length; i++) {
			a3[a1.length+i] = a2[i];
		}
		return a3;
	}

	/**
	 * Merges two sorted arrays into a sorted array.
	 * 
	 * @param a1
	 *            a sorted {@code int} array.
	 * @param a2
	 *            a sorted {@code int} array.
	 * @return a sorted array containing the elements from the specified sorted arrays.
	 */
	// Problem 5
	public static int[] merge(int[] a1, int[] a2) {
		//null case
		if (a1 == null && a2 == null) {
			return null;
		}
		else if (a1 == null) {
			return a2;
		}
		else if (a2 == null) {
			return a1;
		}
		//create counter variables
		int a1Counter = 0;
		int a2Counter = 0;
		int a3Counter = 0;
		
		//create new array size a1 length plus a2 length
		int[] a3 = new int [a1.length + a2.length];
		
		//loop through arrays until one of the counters reaches the end of the array
		while (a1Counter < a1.length && a2Counter < a2.length)
		{
			if (a1[a1Counter] <= a2[a2Counter]) 
			{
				a3[a3Counter] = a1[a1Counter];
				a1Counter++;
			}
			else
			{
				a3[a3Counter] = a2[a2Counter];
				a2Counter++;
			}
			a3Counter++;
		}
		
		//copy leftover parts to the new array
		System.arraycopy(a1, a1Counter, a3, a3Counter, a1.length-a1Counter);
		System.arraycopy(a2, a2Counter, a3, a3Counter, a2.length-a2Counter);
		
		return a3;
	}

	/**
	 * The main function.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String[] args) {
		testToString();
		testCompare();
		testConcatenate();
		testMerge();
	}

	private static void testToString() {
		System.out.println(toString(new int[] { 1, 2, 3 }));
		System.out.println(toString(new int[] {}));
		System.out.println(toString(null));
	}

	private static void testCompare() {
		System.out.println(compare(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
		System.out.println(compare(new int[] { 1, 2, 3 }, new int[] { 1, 2, 4 }));
		System.out.println(compare(new int[] { 1, 2, 3 }, new int[] { 1, 2 }));
		System.out.println(compare(new int[] { 1, 2, 3 }, null));
		System.out.println(compare(null, null));
	}

	private static void testConcatenate() {
		System.out.println(toString(concatenate(new int[] { 1, 2, 3 }, new int[] { 1, 3 })));
		System.out.println(toString(concatenate(new int[] { 1, 2, 3 }, null)));
		System.out.println(toString(concatenate(null, null)));
	}

	private static void testMerge() {
		System.out.println(toString(merge(new int[] { 1, 2, 3 }, new int[] { 1, 3 })));
		System.out.println(toString(merge(new int[] { 1, 2, 3 }, null)));
		System.out.println(toString(merge(null, null)));
	}

}

