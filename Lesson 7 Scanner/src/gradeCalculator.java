import java.util.Scanner;
public class gradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inputScan = new Scanner(System.in);
		
		double test1;
		double test2;
		double test3;
		
		System.out.println("Test 1 Grade?");
		test1 = inputScan.nextDouble();
		System.out.println("Test 2 Grade?");
		test2 = inputScan.nextDouble();
		System.out.println("Test 3 Grade?");
		test3 = inputScan.nextDouble();
		
		System.out.println("Test1 Grade : "+test1+"\nTest2 Grade : "+test2+ "\nTest3 Grade : "+test3);
		System.out.println("Average : "+((test1+test2+test3)/3));
	}

}
