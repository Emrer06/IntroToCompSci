import java.util.Scanner;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner userInput = new Scanner(System.in);
		int x;
		System.out.println("Give me a number");
		x = userInput.nextInt();
		
		if(x%5==0)
		{
			System.out.println("The dude abides");
		}
		else if(x%5==1)
		{
			System.out.println("The road to success is always under construction");
			
		}
		else if(x%5==2)
		{
		System.out.println("Has Anyone Really Been Far Even As Decided To Use Even Go Want to do Look More Like?");
		}
		else if(x%5==3)
		{
			System.out.println("I can lick my elbows");
			
		}
		else if(x%5==4)
		{
			System.out.println("Shrek is love, Shrek is life");
		}
	}
	

}
