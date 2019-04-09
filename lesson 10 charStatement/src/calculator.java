import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println("Add. Addition");
		System.out.println("Subtract. Subtraction");
		System.out.println("Multiply. Multiplication");
		System.out.println("Divide. Division\n");
		System.out.print("Your choice? ");
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.nextLine();


		System.out.print("\nEnter first operand.");
		double op1 = kbReader.nextDouble();
		System.out.print("\nEnter second operand.");
		double op2 = kbReader.nextDouble();
		System.out.println(" ");
		switch (choice) {
		case "Add":
		case "add":
			System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
			break;
		case "Subtract":
		case "subtract":
			System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
			break;
		case "Multiply":
		case "multiply":
			System.out.println(op1 + " times " + op2 + "=" + (op1 * op2));
			break;
		case "Divide":
		case "divide":	
			System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
			break;
		default:
			System.out.println("Hey dummy, enter only a A, S, M, or D!");
		}

	}

}
