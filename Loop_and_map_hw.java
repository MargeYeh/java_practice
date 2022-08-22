package loop_map_week6hw;

import java.util.Scanner;
import java.util.ArrayList;


public class Loop_and_map_hw {

	public static void main(String[] args) {
		
//Get 5 numbers from user, store in array, find sum
//struggled with product, max and min
		
		int i,n=0,s=0;
		double avg;
		{
		   
	        System.out.println("Input the 5 numbers : ");  
	         
		}
			for (i=0;i<5;i++)
			{
			    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
			    
	  		s +=n;
		}
		avg=s/5;
		System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
	}
}