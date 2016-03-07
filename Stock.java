package newhello;

import java.util.Scanner;

public class Stock {
	static Scanner s = new Scanner ( System.in );
	    //Instance variables
	    public double price;
	    public String shares;
	    public int numOfShares;
	    public long val;
	    public Stock(double price)
	    {
	        this.price = price;
	        //count = + 1
//	      count ++; //increments the variable count
//	      counter++; //increment the class variable counter
	    }
	    public String toString()
	    //Default Constructor
	    //public String toString()
	    {
	    String str = "The price is:"+ price +" \tand the shares is:" + shares +" \tand the number of shares is " + numOfShares;
	        return str;
	    }
	   
	    
	    //Parameterized Constructor
	    public Stock(double pr,String sh,int num,long val)
	    {
	        //set some default values for the instance variables
	        price = pr;
	        shares = "sh";
	        numOfShares = num;
	        generateva();
	    }
	    public void setstock(double pr,String sh, int num)
	    {
	    	 
	 	    
		        this.price = pr;
		        this.shares = sh ;
		        this.numOfShares = num;
		        generateva();
		        
	    }
	   	    public void setstock()
	    {
	    	 System.out.println("Enter the price,name and no. of shares for the stock");
	 	    
		        this.price = s.nextInt() ;
		        this.shares = s.next() ;
		        this.numOfShares = s.nextInt();
		        generateva();
		        
	    }
	   	    //this will generate a value number useing theMath.random() method
	    public void generateva()
	    {
	        this.val =(long)(Math.random() * 100 + 1);
	    }
	    
	     
	    public double getPrice()
	    {
	        //price
	        return price;
	    }
	    public String getShares()
	    {
	        //shares
	        return shares;
	    }
	    public int numOfShares()
	    {
	        return numOfShares;
	    }
	     
	    public float getval()
	    {
	        return val;
	    }
	}//end of class

