
public class CastingConstant {

	public static void main(String[] args) {

			
			double d1 = 37.9;
			double d2 = 1004.128;
			int i1 = 12;
			int i2 = 18;
			
			
			
			String problem1 = "Problem 1:";
			String problem2="Problem 2:";
			String problem3="Problem 3:";
			String problem4="Problem 4:";
			String problem5="Problem 5:";
			
			System.out.println(problem1+"57.2*(i2/i2)+1 = "+57.2*(i1/i2)+1);
			System.out.println(problem2+"57.2*((double)i1/i2)+1 = "+57.2*((double)i1/i2)+1);
			System.out.println(problem3+"15-i1*(d1*3)+4 = "+(15-i1*(d1*3)+4));
			System.out.println(problem4+"15-i1*(int)(d1*3)+4 = "+(15-i1*(int)(d1*3)+4));
			System.out.println(problem5+"15-i1*((int)d1*3)+4 = "+(15-i1*((int)d1*3)+4));
			
		
	}

}
