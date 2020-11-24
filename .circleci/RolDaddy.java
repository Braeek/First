
public class RolDaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] counter = new int[6];

		for (int i = 0; i < 100; i++)

		{
			int dice = (int) (Math.random() * 6) + 1;
			counter[dice - 1]++;

		}

		System.out.println("Result: How many times...?");
		for (int i = 0; i < counter.length; i++)
			System.out.println((i + 1) + "\t" + counter[i] + " times ");

	}

}
