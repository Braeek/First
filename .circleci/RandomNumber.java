
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=(int)(Math.random()*100);
		int num2=(int)(Math.random()*100);
		int num3=(int)(Math.random()*100);
		
		System.out.println(num1 +" - " + num2 +" - " + num3);
		
		if(num1>num2) {
		if(num3>num1) {
				System.out.println(num3 + " > "+ num1 +" > " + num2);
			}
		else if(num2>num3) {
					System.out.println(num1 +" > " + num2 + " > " + num3);
			}
		else
				System.out.println(num1 + " > " + num3 + " > " + num2);
		
		}
		else if(num2>num1){
			if(num3>num2) {
				System.out.println(num3 + " > " + num2 + ">" + num1);
			}
			else if(num3>num1) {
				System.out.println(num2 + " > " + num3 + ">" + num1);
			}
			else {
				System.out.println(num2 + " > " + num1 + " > " + num3);
			}	
		}
		
	}
}


