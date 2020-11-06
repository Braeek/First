import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);	
		
		double capital, interes;
		int duracion;
		
		System.out.print("Introduzca el capital que va a solicitar: ");
		capital = input.nextDouble();
		
		System.out.print("Introduzca el interes que va a solicitar: ");
		interes = input.nextDouble();
		
		System.out.print("Introduzca la duración del prestamo que va a solicitar: ");
		duracion = input.nextInt();
	
		duracion *= 12;
		interes = interes / 1200;
		
		double pagoMensual = capital * interes / (1 - 1 / Math.pow ( 1 + interes, duracion));
		double pagoTotal = pagoMensual * duracion;
				
		System.out.println("La cuota mensual para el prestamo solicitado es: " + pagoMensual);
		System.out.println("El pago total del prestamo es " + pagoTotal);
		
	}

}
