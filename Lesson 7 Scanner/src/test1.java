import java.util.Scanner;

public class test1 {

	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 Emre = new test1();
		Emre.run();
	}

	public void run(){
		String signup = "no";
		String yup = null;
		while( !signup.equalsIgnoreCase("yes")||!signup.equalsIgnoreCase("y")){
			System.out.println("Would you like to sign up?");
		signup = userInput.nextLine();	
			
		}
		String username1 = "";
		String password1 = "";
		if (signup.equalsIgnoreCase("Yes")||signup.equalsIgnoreCase("Y"))
		{
			System.out.println("Create new account:");
			System.out.println("Enter username:");
			username1 = userInput.nextLine();
			System.out.println("Enter Password:");		
			password1 = userInput.nextLine();
			System.out.println("Your account has been validated. Welcome to Emre.GG!");
		}
		
		login(username1, password1);
	}
	
	
		public void login(String uName, String pWord){
			
		System.out.println("To login enter your username and password:");
		String username;
		String password;
		
		username = userInput.nextLine();
		password = userInput.nextLine();
		
		if (username.equals(uName)&&(password.equals(pWord)))
		{
			System.out.println("Welcome!");
			System.out.println("What would you like to do?\n1: View you darkest secrets\n2: Hire a hitman\n3: Restart your life");
			int choice = userInput.nextInt();
			switch (choice){
			case 1:
				System.out.println("When you were five you killed a baby bird by accident");
				break;
			case 2:
				System.out.println("Hiring dark web hitman: Cleanup Services inbound!");
				break;
			case 3: 
				System.out.println("Restarting life in 3 seconds");
				break;
				
			}
			
		}
		else 
			{System.out.println("Incorrect username and password");
			
			}
		}
	}


