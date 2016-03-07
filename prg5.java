package newhello;

import java.io.*;

public class prg5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter a Number : ");
		n=Integer.parseInt(br.readLine());
		 
		System.out.print("The Prime Factors of "+n+" are : ");
		 
		int i=2;
		do
		  {
		   if(n%i == 0)
		    {
		     System.out.print(i+"    ");
		     n=n/i;
		    }
		   else
		    i++;
		  }while(n>0);

	}

}
