import java.util.Scanner;

public class Mates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 =  (int) (Math.random() *10);
		System.out.println("El número 1 es " + n1);
		int n2 =  (int) (Math.random() *10);
		System.out.println("El número 2 es " + n2);
		int n3;
		int n4 = n1 - n2;
		int n5 = n2 - n1;
		
		if (n1>n2) {
		System.out.println("Teclea el resultado de la resta " + n1  + "-" + n2 + "=");
		}
		else {
		System.out.println("Teclea el resultado de la resta " + n2  + "-" + n1 + "=");
		}
			
		Scanner input = new Scanner(System.in);
		n3 = input.nextInt();
		
		if (n1>n2) {
			if (n3==n4) {
			System.out.println("Respuesta correcta");
			}
			else {
			System.out.println("Respuesta incorrecta");
			}
		}
		
		if (n2>n1) {
			if (n3==n5) {
			System.out.println("Respuesta correcta");
			}
			else {
			System.out.println("Respuesta incorrecta");
			}
		}
		
		
	}

}
