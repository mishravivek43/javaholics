package newhello;

import java.util.Scanner;

public class prg3 {

	public static void main(String[] args) {
		Scanner s = new Scanner ( System.in );
	      String year1;
	      int l;
	      
		  do{
		  System.out.print("Enter the year ");
	       year1 = s.next();
		   l =year1.length();
		  if (l<4)
		  System.out.println("Please enter a valid year");
		  } while(l<4);
		  
		  int year2=Integer.parseInt(year1);
		  int leap=year2%4;
		  if(leap==0)
		  System.out.println("The given year"+year1+"is leap year");
		  else
		  System.out.println("The given year"+year1+"is not a leap year");

	}

}
