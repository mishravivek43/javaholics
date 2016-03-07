package newhello;

import java.util.*;

public class hotel3 extends hotel2
{

	public static void main(String[] args) {
		 Scanner s = new Scanner ( System.in );
		 hotel2 obj1 = new hotel2();
		 ArrayList<ArrayList<String>> food4 = new ArrayList<ArrayList<String>>();
		 food4 = obj1.getdata();
		 System.out.println("Please choose the option ");
		 System.out.println("1 for display 2 for addtion 3 for deletion");
		 int choice = s.nextInt();
		 
		 switch(choice) 
		 {
		 case 1: obj1.display(food4);
		 	break;
		 	
		 case 2: System.out.println("Enter your taste to add");
		 	System.out.println("0 for sour 1 for sweat 2 for hot 3 for other 4 for any other taste youlike to include");
		 	int choice2 = s.nextInt();
		 	
		 	switch(choice2)
		 	{
		 	case 0: System.out.println("Enter your food to add");
		 	   String fd = s.next();
		 	   food4=obj1.addmenu2(food4,choice2,fd);
		 	  obj1.display(food4,choice2);
		 	   break;
		 	   
		 	case 1: System.out.println("Enter your food to add");
		 	   String fd2 = s.next();
		 	   food4=obj1.addmenu2(food4,choice2,fd2);
		 	  obj1.display(food4,choice2);
		 	   break;
		 	   
		 	case 2: System.out.println("Enter your food to add");
		 	   String fd3 = s.next();
		 	   food4=obj1.addmenu2(food4,choice2,fd3);
		 	  obj1.display(food4,choice2);
		 	   break;
		 	   
		 	case 3: System.out.println("Enter your food to add");
		 	   String fd4 = s.next();
		 	   food4=obj1.addmenu2(food4,choice2,fd4);
		 	  obj1.display(food4,choice2);
		 	   break;
		 	   
		 	case 4: System.out.println("Enter your new food with different taste");
		 	   String fd5 = s.next();
		 	  ArrayList<String> fd1 = new ArrayList<String>();
		 	  fd1.add(fd5);
		 	   food4=obj1.addmenu(food4,fd1);
		 	  obj1.display(food4,choice2);
		 	   break; 
		 	   
		 	default:   System.out.println("You have entered wrong credentials");
		 	
		 	}
		 	break;
		 case 3: System.out.println("Enter your food taste from food to delete");
		 	System.out.println("0 for sour 1 for sweat 2 for hot 3 for other 4 for any other taste youlike to include");
		 	int choice3 = s.nextInt();
		 	String dfd = s.next();
		 	
		 	switch(choice3)
		 	{
		 	case 0: System.out.println("hello");
		 		break;
		 		
		 	default: break;	
		 	}
		 }
		 obj1.display(food4);
	}

}
