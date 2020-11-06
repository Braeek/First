import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String word = input.next();
		
		int low = 0;
		int high = word.length()-1;
		
	while(word.charAt(low)==word.charAt(high)&&
			
			low<=high) {
		
		low++;
		high--;
	}
		if (low>high) System.out.println("Yes");
		
		else System.out.println("No");
		
	}

}
