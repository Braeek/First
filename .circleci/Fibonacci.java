import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Which term of the fibonacci serie do you want? ");
		
		int n = input.nextInt();
		
		System.out.println("You term  "+ fibonacci(n));
		
	}

	
	public static int fibonacci(int n) {
		int first = 0;
		int second = 1;
		
		if (n==1) return 0;
		if (n==2) return 1;
		
		int third = 0;
	
	for (int i = 3; i<=n; i++) {
		third = first + second;
		first = second;
		second = third;
	}
	
	return third;
	}
}
