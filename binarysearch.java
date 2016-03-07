package newhello;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		 
		     WorksArray WA = new WorksArray();
		      //To capture user input
		      Scanner input = new Scanner(System.in);
		       

		      //Creating array to store the all the numbers
		      int [] intArray = WA.CreateintArr();
		      WA.dispArr(intArray);
		      bubble.binarySearch( intArray);
		      bubble.insertionSort(intArray);
		      System.out.println("Array After Insertion Sort");
              WA.dispArr(intArray);
              
		      String [] sArray = WA.CreateStringArr();
		      WA.dispArr(sArray);	      
              bubble.binarySearch(sArray);
              bubble.insertionSort(sArray);
              System.out.println("Array After Insertion Sort");
              WA.dispArr(sArray);
	
	
	
	}

	}


