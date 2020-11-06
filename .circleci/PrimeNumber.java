import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int divisor = 2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número entero a consultar");
		number = input.nextInt();
		
		while (divisor <= (number/2) && (number % divisor != 0)) {
			divisor++;
		}
			if (number % divisor == 0 && number != 2)
				System.out.println("El número introducido no es primo");
			else
				System.out.println("El número " + number + " es primo");
			 		
		
	}

}
