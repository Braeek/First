import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {

			System.out.println("Multiply Table number: " + i);
			for (int j = 1; j < 10; j++) {
				System.out.println("\t" + i + " = " + (i * j));
			}
			System.out.println();

		}
	}
}
