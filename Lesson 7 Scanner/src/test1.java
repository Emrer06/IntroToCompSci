import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Would you like to sign up?");
		String yes = userInput.nextLine();
		
		
		
		
		
		
		if (yes.equalsIgnoreCase("Yes")||yes.equalsIgnoreCase("Y"))
		{
			System.out.println("Create new account:");
			System.out.println("Enter username:");
			String username1 = userInput.nextLine();
			System.out.println("Enter Password:");		
			String password1 = userInput.nextLine();
		
			
		System.out.println("Your account has been validated. Welcome to Emre.GG!");
		
		
		System.out.println("To login enter your username and password:");
		String username;
		String password;
		
		username = userInput.nextLine();
		password = userInput.nextLine();
		
		if (username.equals(username1)&&(password.equals(password1)))
		{
			System.out.println("Welcome!");
		}
		else 
			{System.out.println("Incorrect username and password");
			
			}
		}
	}
	

}
