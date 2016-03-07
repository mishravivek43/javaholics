package newhello;

import java.util.Scanner;

public class prg2 {

	public static void main(String[] args) {
		Scanner s = new Scanner ( System.in );
		 int num1;
		 double num2,hper,tper,h=0.0,t=0.0;
	do{
		 System.out.println("Enter the number of times coin must be tossed ");
	      num1 = s.nextInt();
		  if (num1<=0)
		  System.out.println("Please enter a positive integer");
		  } while(num1<=0);
		 for(int i=0;i<num1;i++)
		 {
		  num2=1*Math.random();
		  if (num2>=0.5)
		  h++;
		  else
		  t++;
		 }
		  hper=100*h/(h+t);
		  tper=100*t/(h+t);
		  System.out.println("Total heads percentage"+hper+"and total Tails Percentage"+tper+"for"+num1+"times coin tossed");

	}

}
