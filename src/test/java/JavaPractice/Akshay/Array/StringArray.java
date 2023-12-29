package JavaPractice.Akshay.Array;

public class StringArray {
	public static void main(String[] args) {
		
	
	
	String  ar []= new String[5];
	
	 ar[0]="Akshay";
	 ar[1]="Shubham";
	 ar[2]="Ankit";
	 ar[3]="Sarang";
	 ar[4]="Akash";
//	 
//	 System.out.println("------------print all data-----------");
//	 
//	 for(int i=0; i<=4; i++)
//	 {
//		 System.out.println(ar[i]);
//	 }

//	 for(int i=0; i<=ar.length-1; i++)
//	 {
//		 System.out.println(ar[i]);
//	 }
	 
	 for(String elements: ar) 
	 {
		 System.out.println(elements);
	 }
		 
	 }
	 

}