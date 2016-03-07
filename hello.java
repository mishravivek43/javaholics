package newhello;

import java.util.*;

public class hello {

	public static void main(String[] args) {

		 Scanner s = new Scanner ( System.in );
		 int num1,stack,goal;
		 double num2,wper,lper,w=0,l=0;
	do{
		 System.out.println("Enter the number of times bets must be placed,Stack and Goal ");
	      num1 = s.nextInt();
		  stack = s.nextInt();
		  goal = s.nextInt();
		  if (num1<=0)
		  System.out.println("Please enter a positive integer");
		  } while(num1<=0);
		 for(int i=0;i<num1;i++)
		 {
		  num2=1*Math.random();
		  if (num2>=0.6){
		  stack++;
		  w++;}
		  else{
		  stack--;
		  l++;}
		  if (stack==0||stack==goal)
		  break;
		 }
		  wper=100*w/(w+l);
		  lper=100*l/(w+l);
		  System.out.println("Total Stack left after betting"+stack);
		  System.out.println("Total win percentage"+wper+"and total lose Percentage"+lper+"for"+w+l+"times bet placed");
	}

}
