
public class passaword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pw = randomPassaword(); 
		System.out.println(pw);
		
	}	
	
	public static String randomPassaword() {
		
		String pw = "";
		
		for (int i = 1; i<=10; i++) {
			int r = (int)(Math.random()*3);
			char c;
			switch(r) {
				case 0: c = randomChar('0','9');break;
				case 1: c = randomChar('a','z');break;
				default: c = randomChar('A', 'Z');break;
			
		}
			pw+=c;
		
	}
		return pw;
	}
	public static char randomChar(char start, char end) {
		return		(char)( start +(int)(Math.random()*(end-start)));
	}

}