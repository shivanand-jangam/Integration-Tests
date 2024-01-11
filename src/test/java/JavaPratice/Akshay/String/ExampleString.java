package JavaPratice.Akshay.String;

public class ExampleString {

	public static void main(String[] args) {

      String s1="Yavatmal";
      
      String s2="abcd";
      String s3="ABCD";
      String s4="Java Selenium";
      String s5="Akshay";
      String s6="Nimbokar";
      String s7="Hi This is Akshay Nimbokar";
      
      
      System.out.println(s1.length()); // length count
      
      System.out.println(s1.toUpperCase()); // convert to UpperCase
      
      System.out.println(s1.toLowerCase()); // convert to LowerCase
      
      System.out.println(s2.equals(s3));   // case sensitive
      // equals function --Data compare then case compare both are equal then output in boolean
      
      System.out.println(s2.equalsIgnoreCase(s3));// not case sensitive
      
      // equals function --Data compare  then output in boolean
      
      System.out.println(s1.contains("Yav")); // String contains
      
      System.out.println("-----------------------------------------------------");
      
      System.out.println(s1.charAt(1));  // charAt-- Yavatmal --01234567
      
      System.out.println(s1.indexOf("Y"));  // index count left side
      
      System.out.println(s1.lastIndexOf("m")); // index count left side   last/
      
      
      System.out.println(s1.isEmpty());
      
      System.out.println(s4.replace("Java", "Automation")); //( old String , new String); // temporary replace
      
      System.out.println(s5.concat(s6)); // concatenate of two string
      
      System.out.println(s5+s6); // concatenate of two string
      
      System.out.println(s5.contains("Ak"));
      
      s6=s6.replace("Java", "Automation");
      System.out.println(s6);    // Parmanent replace
      
      System.out.println(s1.substring(0, 5));//  (Start letter , end letter)
      
      System.out.println(s1.substring(0));// start letter
      
      System.out.println(s7.startsWith("Hi"));  // start with String
      
      System.out.println(s7.endsWith("Nimbokar")); // end with String
      
	}

}
