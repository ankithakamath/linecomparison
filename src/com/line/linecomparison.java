package com.line;
import java.util.Scanner;

public class linecomparison {
	
		int line1[]=new int[4];
		int line2[]=new int[4];
		double distance1,distance2;

		public void getCoordinates() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the coordinates of line 1");
		line1[0]=sc.nextInt();
		line1[1]=sc.nextInt();
		line1[2]=sc.nextInt();
		line1[3]=sc.nextInt();
		System.out.print("enter the coordinates of line 2");
		line2[0]=sc.nextInt();
		line2[1]=sc.nextInt();
		line2[2]=sc.nextInt();
		line2[3]=sc.nextInt();
		sc.close();
	}
	public void calculateDistance() {
		
		int[] line1 = null;
		double distance1=Math.sqrt((line1[2]-line1[0])*(line1[2]-line1[0])+(line1[3]-line1[1])*(line1[3]-line1[1]));
		double distance2=Math.sqrt((line2[2]-line2[0])*(line2[2]-line2[0])+(line2[3]-line2[1])*(line2[3]-line2[1]));
		System.out.println("length of line 1 = "+distance1);
		System.out.println("length of line 2 =" +distance2);		
	}
	

	 public void usingCompareTo(Double distance1,Double distance2)
	    {
	    	
		 if(distance1.equals(distance2))
		 {
				 System.out.println("Two lines are equal");
			 }
		 else if(distance1.compareTo(distance2) > 0) {
		    	System.out.println("Line1 is greater than Line2");
		    }
		    else {
		    	System.out.println("Line1 is lesser than Line2");
		    }
		    
}
}