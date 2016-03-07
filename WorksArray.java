package newhello;

import java.util.*;

public class WorksArray {
	Scanner s = new Scanner ( System.in );

	public int[] CreateintArr(){
	
		 System.out.println("enter no. of elements to add into array");
		 int x =s.nextInt();
           //create an int array we want to sort using bubble sort algorithm
           int intArray[] = new int[x];
           System.out.println("Enter "+x+" elements");
           for(int i =0;i<x;i++){
           intArray[i]=s.nextInt();
          
           }
           return intArray;
}
public void dispArr(int[] intArray) {         
//print array before sorting using bubble sort algorithm
           System.out.println("Integer Array");
           for(int i=0; i < intArray.length; i++){
                   System.out.print(intArray[i] + " ");
           }
          System.out.println("");
}
public String[] CreateStringArr(){
		 System.out.println("enter no. of elements to add into array");
		 int x =s.nextInt();
           //create an int array we want to sort using bubble sort algorithm
           String sArray[] = new String[x];
           System.out.println("Enter "+x+" elements");
           for(int i =0;i<x;i++){
           sArray[i]=s.next();
           
           }
           return sArray;
}
public void dispArr(String[] sArray) {         
	//print array before sorting using bubble sort algorithm
	           System.out.println("String Array");
	           for(int i=0; i < sArray.length; i++){
	                   System.out.print(sArray[i] + " ");
	           }
	           System.out.println("");
}
}

