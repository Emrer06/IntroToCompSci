import java.util.Scanner;
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		String y;
		
		
		System.out.println("Yes or No");
		y = userInput.nextLine();
		
		if(y.equalsIgnoreCase("yes"))
		{
			System.out.println("Of course");
		}
		else if(y.equalsIgnoreCase("no"))
		{
			System.out.println("indubitably");
		}
		else System.out.println("hhhhhwwwhhaatttt?1?!");
	}

}
