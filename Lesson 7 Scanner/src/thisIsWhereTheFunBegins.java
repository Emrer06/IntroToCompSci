import java.util.Scanner;
public class thisIsWhereTheFunBegins {

	public static void main(String[] args) {

			
			Scanner inputScan = new Scanner(System.in);
			
			double area;
			
			System.out.println("What is the area of your circle?");
			area = inputScan.nextDouble();
			System.out.println("The radius is: "+Math.sqrt(area/Math.PI));
			
			
		
		
		

	}

}
