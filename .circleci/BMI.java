import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double altura;
		double peso;
		
			System.out.print("Introduzca su altura en metros " );
		Scanner input = new Scanner(System.in);
		altura = input.nextDouble();
			System.out.print("Introduzca su peso en kilogramos " );
		peso = input.nextDouble();
		
		double bmi = peso/(Math.pow(altura, 2));
			System.out.println( + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Su peso es inferior al normal.");
		}
		else if (bmi < 25.0) {
			System.out.println("Su peso es normal.");
		}
		else if (bmi < 30) {
			System.out.println("Su peso es superior al normal.");
		}
		else {
			System.out.println("Usted sufre obesidad.");
		}
		
		
	}
}
