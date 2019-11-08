package Homework;

public class HW1Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toString(new int[] {1,2,3}));
	}

	static String toString(int[] numbers) {
		// TODO Auto-generated method stub
		if (numbers == null) {
			return "()";
		}
		String answer = "(";
		for (int i = 0; i < numbers.length; i++) {
			if (i != (numbers.length-1)) {
				answer = answer + numbers[i] + ", ";
			}
			else {
				answer = answer + numbers[i];
			}
		}
		return answer = answer + ")";
	}

}
