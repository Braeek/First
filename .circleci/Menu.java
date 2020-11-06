import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		int n;
		int n1;
		Scanner input = new Scanner(System.in);
		do {
			op = menu();
			switch(op) {
			case 1:
				System.out.print("Enter a number to check if is or not prime: ");
				n =input.nextInt();
				if (isPrime(n))
					System.out.println("the number "+n+" is prime");
				else
					System.out.println("the number "+n+" is NOT prime");
				break;
			
			case 2:	
			
					System.out.print("Enter a number to check if is or not even: ");
					n =input.nextInt();
					if (isEven(n))
						System.out.println("the number "+n+" is even");
					else
						System.out.println("the number "+n+" is odd");
					break;
			case 3:	
				
					System.out.println("Enter 2 numbers to calculate their GCD: ");
					System.out.print("Number 1:");
					n =input.nextInt();
					System.out.print("Number 2:");
					n1 =input.nextInt();
					
					System.out.println("the GCD of"+n+" and "+n1+ " is "+GCD(n,n1));
					
					break;
					
			case 4:	
				
				System.out.println("Enter a numbers to get it hexdecimal version ");
				System.out.print("Number 1:");
				n =input.nextInt();
				
				
				System.out.println(n+ " =  "+decimalToHex(n));	
				
				break;
				
			case 5:
				
				System.out.println("Enter a numbers to get it decimal version ");
				System.out.print("Number 1:");
				n =input.nextInt();
				
				
				System.out.println(n+ " =  "+decimalToHex(n));
			}
			
			
		}while (op!=6 );

	}
public static String decimalToHex(int decimal) {
	String hex = "";
    
    while (decimal != 0) {
      int hexValue = decimal % 16; 
    
      // Convert a decimal value to a hex digit 
      char hexDigit;
      if (0 <= hexValue && hexValue <= 9) {
    	   hexDigit = (char)(hexValue + '0');
          
      
      }
      else
    	  hexDigit = (char)(hexValue - 10 + 'A');
   /*   char hexDigit = (0 <= hexValue && hexValue <= 9) ?
        (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');*/
     
      hex = hexDigit + hex;
      
      decimal = decimal / 16;
    }
    
    return hex;
	
}
public static int GCD(int n1,int n2) {
		int d=(n1<n2)?n1:n2;
		while (n1%d !=0 || n2%d !=0)
			d--;
		return d;
		
	}	
	public static boolean isEven(int n) {
		
		if (n % 2 == 0 ) 
			return true;
		return false;
	}	
	
	public static boolean isPrime(int n) {
		int d = 2;

		while (d < (n / 2) && (n % d != 0))
			d++;
		if (n % d != 0 || n==2) 
			return true;
		return false;
	}		
		
  public static int menu() {
	  int option;
	  Scanner input = new Scanner(System.in);
	  System.out.println("\t\tMenu");
	  System.out.println("\t\t"+"______");
	  System.out.println("\t\t1.- Is prime?");
	  System.out.println("\t\t2.- Is even?");
	  System.out.println("\t\t3.- GCD");
	  System.out.println("\t\t4.- Decimal number to Hexadecimal");
	  System.out.println("\t\t5.- Hexadecimal number to Decimal");
	  System.out.println("\t\t6.- Exit");
	  System.out.println("\t\t\t Your choise: ");
	  option = input.nextInt();
	  return option;
  }
}
