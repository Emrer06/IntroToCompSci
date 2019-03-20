import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println("A. Addition");
		System.out.println("S. Subtraction");
		System.out.println("M. Multiplication");
		System.out.println("D. Division\n");
		System.out.print("Your choice? ");
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.nextLine( );
		
		char ch = choice.charAt(0); 
		System.out.print("\nEnter first operand."  );
		double op1 = kbReader.nextDouble( );
		System.out.print("\nEnter second operand ." );
		double op2 = kbReader.nextDouble( );
		System.out.println(" ");
		switch (ch)
		{
		case 'A': 
		case 'a': 
		System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
		break;
		case 'S': 
		case 's':
		System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
		break;
		case 'M': 
		case 'm':
		System.out.println(op1 + " times " + op2 +  "="  + (op1 * op2) );
		break;
		case 'D': 
		case 'd':
		System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
		break;
		default:
		System.out.println("Hey dummy, enter only a A, S, M, or D!");
		}
		
		
		
		
	}

}
