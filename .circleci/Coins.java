import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de centimos que quiere recibir en monedas: ");
		int totalMonedas = input.nextInt();
		
		int dosEuros = totalMonedas /200;
		System.out.println("La cantidad de monedas de 2 euros es: " + dosEuros);
		totalMonedas = totalMonedas % 200;
		
		int unEuro = totalMonedas /100;
		System.out.println("La cantidad de monedas de 1 euros es: " + unEuro); 
		totalMonedas = totalMonedas % 100;
		
		int cincuentaCentimos = totalMonedas / 50;
		System.out.println("La cantidad de monedas de 50 centimos es: " + cincuentaCentimos);
		totalMonedas = totalMonedas % 50;
		
		int veinteCentimos = totalMonedas / 20; 
		System.out.println("La cantidad de monedas de 20 centimos es: " + veinteCentimos);
		totalMonedas = totalMonedas % 20;
		
		int diezCentimos = totalMonedas / 10; 
		System.out.println("La cantidad de monedas de 10 centimos es: " + diezCentimos);
		totalMonedas = totalMonedas % 10;
		
		int cincoCentimos = totalMonedas / 5; 
		System.out.println("La cantidad de monedas de 5 centimos es: " + cincoCentimos);
		totalMonedas = totalMonedas % 5;
		
		int dosCentimos = totalMonedas / 2; 
		System.out.println("La cantidad de monedas de 2 centimos es: " + dosCentimos);
		totalMonedas = totalMonedas % 2;
		
		int unCentimo = totalMonedas ;
		System.out.println("La cantidad de monedas de 1 centimos es: " + unCentimo);
	}

}
