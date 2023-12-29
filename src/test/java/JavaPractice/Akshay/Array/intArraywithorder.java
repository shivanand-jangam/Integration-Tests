package JavaPractice.Akshay.Array;

import java.util.Arrays;

public class intArraywithorder {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		
		arr[0]=600;
		arr[1]=300;
		arr[2]=480;
		arr[3]=270;
		
		
		// print in ascending order
		Arrays.sort(arr);
		for(int i=0; i<=arr.length-1; i++ )
		{
			System.out.println(arr[i]);
		}
		
		// print in descending order;
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}

	}

}
