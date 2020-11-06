import java.util.Scanner;

public class First50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("First 50 Prime Numbers: ");

		int counter = 0;
		String report = "";
		int number = 0;

		while (counter < 50) {
			number++;
			int d = 2;

			while (d < (number / 2) && (number % d != 0))
				d++;

			if (number % d != 0 || number == 2) {
				report += "\t" + number;
				counter++;

				if (counter % 10 == 0)
					report += "\n";

			}

		}
		System.out.println(report);
	}
}