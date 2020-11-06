import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduzca un número de dos dígitos para realizar su apuesta: ");
		Scanner input=new Scanner(System.in);
		int apuesta=input.nextInt();
		
		int apuesta1=apuesta/10;
		int apuesta2=apuesta%10;
		
		
		int premio= (int)(Math.random()*100);
		System.out.println("El número premiado es el " + premio);
		
		int premio1=premio/10;
		int premio2=premio%10;
		
		if (apuesta1+apuesta2==premio1+premio2) {
			System.out.println("Has ganado en la lotería 10.000€.");
		}
		else if (apuesta2+apuesta1==premio1+premio2) {
			System.out.println("Ha ganado en la lotería 3.000€.");
		}
		else if (apuesta1==premio1 || apuesta1==premio2 
				|| apuesta2==premio1 || apuesta2==premio2) {
			System.out.println("Ha ganado en la lotería 1.000€.");
		}
		else {
			System.out.println("No ha ganado esta vez, pruebe otra vez.");
		
		}
	}
}
