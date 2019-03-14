import java.util.Scanner;
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner userInput = new Scanner(System.in);
		
		String one;
		String two;
		
		System.out.println("Give me a statement...");
		
		one = userInput.nextLine();
		
		System.out.println("Give me another statement you silly person");
		
		two = userInput.nextLine();
		
		if (one.equals(two))
				{
			System.out.println("Equal - Case sensitive");
				}
		else if (one.equalsIgnoreCase(two))
		{
			System.out.println("Equals - Not case sensitve");
		}
		
		
		
		
		
		
	}

}
