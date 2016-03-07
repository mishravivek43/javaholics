package newhello;

import java.util.ArrayList;

public class hotel2 {

	public ArrayList<ArrayList<String>> getdata()
	{
		ArrayList<ArrayList<String>> food = new ArrayList<ArrayList<String>>();
		ArrayList<String> sour = new ArrayList<String>();
		ArrayList<String> sweat = new ArrayList<String>();
		ArrayList<String> hot = new ArrayList<String>();
		ArrayList<String> other = new ArrayList<String>();
      
		sour.add("idly");
       sour.add("Sambhar");
       sour.add("tomato soup");
       sweat.add("Gulab Jamun");
       sweat.add("Jalebi");
       sweat.add("Ice creame");
       hot.add("paratha");
       hot.add("Dal Fry");
       hot.add("pakoda");
       other.add("Papad");
       food.add(sour);
       food.add(sweat);
       food.add(hot);
       food.add(other);
       
       return food;
	}

	public void display(ArrayList<ArrayList<String>> food6){
		System.out.println("your menu is:"+food6);
	}
	
	public void display(ArrayList<ArrayList<String>> food6, int ch){
		System.out.println("your menu is:"+food6.get(ch));
	}
	public ArrayList<ArrayList<String>> addmenu(ArrayList<ArrayList<String>> food2,ArrayList<String> abs)
	{
		
			food2.add(abs);
			return food2;
	}

	public  ArrayList<ArrayList<String>> addmenu2(ArrayList<ArrayList<String>> food3, int n,String a)
	{
		food3.get(n).add(a);
		return food3;
	}
	
	//public void remmenu()
	}	
	
	
	
	