import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number");
		int decimal = input.nextInt();
		
		
		String hex = "";
		
		while (decimal !=0) {
			int hexValue = decimal % 16;
			System.out.println(hexValue + "es el resto de dividir entre 16");
			
			char hexDigit;
			
			if(0 <= hexValue && hexValue <= 9) {
				hexDigit = (char)(hexValue + '0');
				
			}
			
			else
				hexDigit = (char)(hexValue - 10 + 'A');
			System.out.println(hexValue + '0');
			hex = hexDigit + hex;
			System.out.println(hex);
			decimal = decimal /16;
			
		}
		System.out.println("The hex number is" + hex);
	}

}
