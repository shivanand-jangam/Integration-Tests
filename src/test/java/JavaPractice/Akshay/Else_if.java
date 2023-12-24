package JavaPractice.Akshay;

public class Else_if {
	public static void main(String[] args) {
		
		int studentmarks=45;
	
	if(studentmarks>=65)
	{
		System.out.println("Student pass with A+ Grade");
	}
	
	else if(studentmarks>=60)
	{
		System.out.println("Student pass with A Grade");
	}
	
	else if(studentmarks>=50)
	{
		System.out.println("Student pass with B Grade ");
	}
	
	else if(studentmarks>=35)
	{
		System.out.println("Student pass with C Grade ");
	}
	
	else
	{
		System.out.println("Student is fail ");
	}
		
	}

}
