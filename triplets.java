package newhello;

import java.util.*;

public class triplets {

	public static void main(String[] args) {
		 Scanner s = new Scanner ( System.in );
		 System.out.println("enter no. of elements");
		 int x = s.nextInt();
		 int [] num1 = new int [x];
		 System.out.println("Enter "+x+"elements one by one");
		 for(int i = 0; i<x; i++ )
		 {
			 num1[i]=s.nextInt();
		 }
		 
		 Arrays.sort(num1);
		 int j,k,l;
		 for( j = 0; j<x; j++ ) {
			  k= j+1 ; // Start right after i.
			  l = x-1  ;  // Start at the end of the array.

			  while (l >= k) {
			    // We got a match! All done.
			    if (num1[j] + num1[k] + num1[l] == 0) {
			    	
			    
			    	System.out.println(num1[j]+","+ num1[k]+","+ num1[l]);
                    break;
			    }
			    // We didn't match. Let's try to get a little closer:
			    //   If the sum was too big, decrement l.
			    //   If the sum was too small, increment k.
			    else{
			    int a = num1[j] + num1[k] + num1[l];
			   if (a>0)
				   l--;
				   else
					k++ ; 
			    }	
			  }
			  // When the while-loop finishes, k and l have passed each other and there's
			  // no more useful combinations that we can try with this j.
			}
	}

}
