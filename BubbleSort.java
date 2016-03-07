package newhello;

import java.util.*;

public class BubbleSort {
 
        public static void main(String[] args) {
   		 WorksArray WA = new WorksArray();
                 int intArray[] = WA.CreateintArr();
               
                 System.out.println("Array Before Bubble Sort");
                WA.dispArr(intArray);
               
                //sort an array using bubble sort algorithm
                bubble.bubbleSort(intArray);
               
                System.out.println("");
               
                //print array after sorting using bubble sort algorithm
                System.out.println("Array After Bubble Sort");
                WA.dispArr(intArray);
                
                
                       String sArray[] = WA.CreateStringArr();
                       
                       //print array before sorting using bubble sort algorithm
                       System.out.println("Array Before Bubble Sort");
                       WA.dispArr(sArray);
                      
                       //sort an array using bubble sort algorithm
                       bubble.bubbleSort(sArray);
                      
                       System.out.println("");
                      
                       //print array after sorting using bubble sort algorithm
                       System.out.println("Array After Bubble Sort");
                       WA.dispArr(sArray);
       
        }
 
       
}
 

