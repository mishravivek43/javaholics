package newhello;

import java.util.Scanner;

public class bubble {
	static Scanner s = new Scanner ( System.in ); 
	static WorksArray WA = new WorksArray();
	public static void bubbleSort(int[] intArray) {
                         
         int n = intArray.length;
         int temp = 0;
        
         for(int i=0; i < n; i++){
                 for(int j=1; j < (n-i); j++){
                        
                         if(intArray[j-1] > intArray[j]){
                                 //swap the elements!
                                 temp = intArray[j-1];
                                 intArray[j-1] = intArray[j];
                                 intArray[j] = temp;
                         }
                        
                 }
         }
	 }
         public static void bubbleSort(String[] sArray) {
 		String temp;
     	for(int x=1;x<sArray.length;x++)
     		{
     		for(int y=0;y<sArray.length-x;y++)
     			{
     			if(sArray[y].compareTo(sArray[y+1])>0)
     				{
     				temp=sArray[y];
     				sArray[y]=sArray[y+1];
     				sArray[y+1]=temp;
     				
     				}
     				}
     		}
     		}
     	public static void binarySearch( String [] sArray ){
     		System.out.println("Enter the search value:");
		      String item = s.next();
     		
     		int	first = 0;
		  int    last = sArray.length-1;
		  int    middle = (first + last)/2;

		      while( first <= last )
		      {
		         if ( item.compareTo(sArray[middle])>0)
		           first = middle + 1;
		         else if ( item.compareTo(sArray[middle])<0 )
		         {
		        	 last = middle - 1;
		        	 
		         }
		         else
		         {
		        	 System.out.println(item + " found at location " + (middle + 1) + ".");
			           break;
		         }
		         middle = (first + last)/2;
		      }
		      if ( first > last )
		          System.out.println(item + " is not found.\n");
		   }
		
     	public static void binarySearch( int [] intArray ){
     		System.out.println("Enter the search value:");
		      int item = s.nextInt();
     		
     		int	first = 0;
    		  int    last = intArray.length-1;
    		  int    middle = (first + last)/2;

    		      while( first <= last )
    		      {
    		         if ( intArray[middle] < item )
    		           first = middle + 1;
    		         else if ( intArray[middle] == item )
    		         {
    		           System.out.println(item + " found at location " + (middle + 1) + ".");
    		           break;
    		         }
    		         else
    		         {
    		             last = middle - 1;
    		         }
    		         middle = (first + last)/2;
    		      }
    		      if ( first > last )
    		          System.out.println(item + " is not found.\n");
    		   }
     	 public static void insertionSort(int intArray[]) {
             int n = intArray.length;
             for (int j = 1; j < n; j++) {
                 int key = intArray[j];
                 int i = j-1;
                 while ( (i > -1) && ( intArray [i] > key ) ) {
                	 intArray [i+1] = intArray [i];
                     i--;
                 }
                 intArray[i+1] = key;
                 //WA.dispArr(int[] intArray);
             }
         }
     	 public static void insertionSort(String sArray[]) {
             int n = sArray.length;
             for (int j = 1; j < n; j++) {
                 String key = sArray[j];
                 int i = j-1;
                 while ( (i > -1) && ( key.compareTo(sArray[i])>0 ) ) {
                	 sArray [i+1] = sArray [i];
                     i--;
                 }
                 sArray[i+1] = key;
                 //WA.dispArr(int[] intArray);
             }
         }
}
