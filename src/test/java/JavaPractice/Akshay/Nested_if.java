package JavaPractice.Akshay;

public class Nested_if {

	public static void main(String[] args) {
		
		int age=22;
		int weight=55;
				
	  if(age>=18)   // outer if
	  {
		  System.out.println("age>=18");
		  
		  if(weight>=50) // inner if nested if
		  {
			  System.out.println("eligible for blood donation: weight>=50");
		  }
		  else
		  {
			  System.out.println("Not eligible for blood donation: weight<=50");
		  }
	  }
	  
	  else
	  {
		  System.out.println("Not eligible for blood donoation age<=18");
	  }

	}

}
