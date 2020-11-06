import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number1");
		int number1 = input.nextInt();
		System.out.print("Enter a number2");
		int number2 = input.nextInt();
		int d = number1<number2?number1:number2;
				
		while (number1 % d !=0 || number2 % d !=0)
			d--;
		
		System.out.println("GCD fot "+number1 + " and "+number2+ " is " +d);
		
		
		
		
		
	}

}
