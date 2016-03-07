package newhello;

import java.util.Scanner;

public class prg6 {

	public static void main(String[] args) {
		 Scanner s = new Scanner ( System.in );
		 double result=0;
		 System.out.print("Enter a Number : ");
		 int har = s.nextInt();
		 for(double i =1;i<=har;i++)
		 result=result+1/i;
		 System.out.println("nth harmonic value="+result);

	}

}
