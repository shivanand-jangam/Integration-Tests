package JavaPractice.shiva;


public class Executor {

	float f;
	String s;
	double d;

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		calculator.add(10, 05);

		double a = Double.valueOf("151");
		System.out.println(a);

		String myString = "akcfac@lkanklacn@6545615@";
		System.out.println(myString);
		System.out.println("===========");
		System.out.println(myString.replace("@", " "));
		System.out.println("===========");

		String myString2 = "shiva%d@%s.%s";

		System.out.println(String.format(myString2, 123, "yahoo", "net"));
		System.out.println("===========");

		System.out.println(myString2.replace("%s", ".jangam"));
		System.out.println("===========");

		String x = "10";
		String y = "20";

		double doubleValue=Double.parseDouble(x) + Double.parseDouble(y);
		System.out.println("Decimal Formatted Values: "+String.format( "%.2f", doubleValue ));
		System.out.println("===========");

		System.out.println(Double.parseDouble(x) + Double.parseDouble(y));
		System.out.println("===========");

		System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
		System.out.println("===========");

		double aa = 10;
		double bb = 20;
		System.out.println(String.valueOf(aa) + String.valueOf(bb));
		
	}
}
