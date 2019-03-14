
import java.util.Scanner;

public class ifStatements {

	public static void main(String[] args) {
		
		Scanner userI = new Scanner(System.in);
		
		double int1;
		double int2;
		
		System.out.println("Give me a number!");
		int1 = userI.nextInt();
		System.out.println("GIVE ME ANOTHER ONE!!!!");
		int2 = userI.nextInt();
	
		if (int1==(2*int2)||(int1>2*int2))
		{
			System.out.println("Your face smells like peppermint!");
		}

		else if (int1==(0.5)*int2)
		{
			System.out.println("That's so fetch!");
		}
		
	
	}

}
