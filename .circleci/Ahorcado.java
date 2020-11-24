import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¡Welcome to my hanged!");
		Scanner input = new Scanner(System.in);
		
		String palabragenerada="";
		String palabrausuario="";
		int errorcounter= 0;
		
	while (errorcounter<10)
		
		if	(palabragenerada==palabrausuario)
		System.out.println("You win!");
			
		else if (palabragenerada!=palabrausuario);
			System.out.println("You fall");
			
			errorcounter++;
			
			
	}

}
