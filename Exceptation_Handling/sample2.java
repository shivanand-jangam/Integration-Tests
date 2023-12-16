package Exceptation_Handling;

public class sample2 {
public static void main(String[] args) {
	

	int ar[]= new int[10];
	
	
	try {
		
		ar[11]=20; // risky code;
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out Of Bounds Exception handled");
	}
	
	  System.out.println("health"); 
}
}