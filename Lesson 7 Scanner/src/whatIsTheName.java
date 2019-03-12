import java.util.Scanner;
public class whatIsTheName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inputScan = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = inputScan.next();
		System.out.println("What is your last name?");
		String name1 = inputScan.next();
		System.out.println("Your full name is "+name+" "+name1);
		
		
	}

}
