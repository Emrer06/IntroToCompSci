
import java.util.Scanner;

public class test1 {

	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 Emre = new test1();
		Emre.run();
	}

	public void run() {
		String signup = "no";
		String yup = null;
		while (!signup.equalsIgnoreCase("yes") && !signup.equalsIgnoreCase("y")) {
			System.out.println("Would you like to sign up?");
			signup = userInput.nextLine();

		}
		String username1 = "";
		String password1 = "";
		if (signup.equalsIgnoreCase("Yes") || signup.equalsIgnoreCase("Y")) {
			System.out.println("Create new account:");
			System.out.println("Enter username:");
			username1 = userInput.nextLine();
			System.out.println("Enter Password:");
			password1 = userInput.nextLine();
			System.out.println("Your account has been validated. Welcome to Emre.GG!");
		}

		login(username1, password1);
	}
	
	
	public void login(String uName, String pWord) {
		
		System.out.println("To login enter your username and password:");
		String username;
		String password;

		username = userInput.nextLine();
		password = userInput.nextLine();

		if (username.equals(uName) && (password.equals(pWord))) {
			System.out.println("Welcome!");
			System.out.println(
					"What would you like to do?\n1: View you darkest secrets\n2: Hire a hitman\n3: Restart your life");
			int choice = userInput.nextInt();
			switch (choice) {
			case 1:
				System.out.println("When you were five you killed a baby bird by accident, how does this make you feel?");
				System.out.println("1: Terrible");
				System.out.println("2: Happy, animal overpopulation is also a cause for concern");
				System.out.println("3: Indifferent you have no soul, time is a scoial construct, we are all meat puppets roaming the earth");
			int choice2 = userInput.nextInt();
			if (choice2==1){
				
				System.out.println("You succumb to the depression of your past, you jump off your roof");
				System.out.println("You have failed Emre.GG");
			} else if (choice2 ==2){
				System.out.println("The SWAT team break into your house, uncovering plans to bomb the bird monument");
				System.out.println("You have failed Emre.GG");
			}
			else if (choice2==3){
				System.out.println("One by one the world around you falls apart, every hair of existence is ripped from your sight, "
						+ "you do not exist anymore");
				System.out.println("You have failed Emre.GG");
			}
			else {
				System.out.println("You did not choose from the three options.");
				System.out.println("You have failed Emre.GG");
			}
	
				break;
			case 2:
				System.out.println("Choose your hitman");
				System.out.println("1: Dimitri Brovasky: ex KGB, CIA informanant, makes things look like an accident $1,500,000 ");
				System.out.println("2: John Smith: ex Navy Seal, informant for MI6, likes guns... a lot. $3,000,000");
				System.out.println("3: Craig: nobody knows where he came from, nobody knows what he wants, he has no definiton of mercy. $20,000,000");
			int choice3 = userInput.nextInt();
			if (choice3==1){
				
				System.out.println("Dimitri Brovasky failed to get your target, he got sidetracked at the circus and adopted a bear");
				System.out.println("You have failed Emre.GG");
			} else if (choice3 ==2){
				System.out.println("On the way to get your target, John Smith spilled McDonald's coffee on his lap, causing 2nd degree burns on his no no square");
				System.out.println("You have failed Emre.GG");
			}
			else if (choice3==3){
				System.out.println("Craig wiped out your target, his family, and everyone within a 50 mile radius, this includes you.");
				System.out.println("You have failed Emre.GG");
			}
			else {
				System.out.println("You did not choose from the three options.");
				System.out.println("You have failed Emre.GG");
			}
				break;
			case 3:
				System.out.println("Restarting life in 3 seconds");
				
				System.out.println("You are born into a rich 1800s irish family, father works with a potato, mother "
						+ "cleans the house, you live in a mansion, 10 years later a famine strikes and you all die of starvation");
				System.out.println("You have failed Emre.GG");
				break;
				 
			}

		} 
		else {
			
			System.out.println("Incorrect username and password");

		}
	}
}
