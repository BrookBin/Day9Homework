package day9Homework;

public class Question5 {
	

	public static void main(String args[]) {

		int num = 0;

		for (num = 0; num <= 32; num++) {

			if (num % 2 == 0 && num >= 2 && num <= 5) {

				System.out.println("Even number " + num);
				continue;

			} else if (num % 2 == 0 && num >= 6 && num <= 20) {

				System.out.println("Even number " + num);
				continue;

			} else if (num % 2 == 1 && num >= 15 && num <= 20) {

				System.out.println("Odd number " + num);
				continue;

			} else {

				System.out.println(num);
			}
		}

	}

}
