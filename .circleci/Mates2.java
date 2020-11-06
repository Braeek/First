import java.util.Scanner;

public class Mates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int number_of_questions = 5;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
			String output = "";
			Scanner input = new Scanner(System.in);

			int n1 =  (int) (Math.random() *10);
			int n2 =  (int) (Math.random() *10);
			
	    	if (n1 < n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}


			System.out.println("What is " + n1 + "-" + n2 + "?");

			int answer = input.nextInt();


			while (! (n1 - n2 == answer)) {
				System.out.println("Your answer is wrong.\n. Try again!!");
					answer = input.nextInt();
				}


			System.out.println("You are correct!\n");

					count++;

							

				long endTime = System.currentTimeMillis();
				long testTime = endTime - startTime;

				System.out.println("Congratulation" + "\nTest time is " + testTime / 1000 + " seconds\n");
		
		
	}

}
