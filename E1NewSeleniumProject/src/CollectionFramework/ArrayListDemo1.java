package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList al = new ArrayList();      //Hetrogenous
		List al = new ArrayList();
		
		//ArrayList <Integer> al = new ArrayList<Integer>();
		//ArrayList <String> al = new ArrayList<String>();
		
		//Add new elements to Array list
		al.add(100);
		al.add("Welcome");
		al.add('O');
		al.add(332.43);
		al.add(true);
		
		System.out.println(al); 	//[100, Welcome, O, 332.43, true]
		
		//size()
		System.out.println("Number of elements: "+al.size());
		
		//remove elements
		al.remove(1);      		//remove 1 is index		
		
		System.out.println("After removing elements: "+al); //[100, O, 332.43, true]
		
		//add element in the middle of the array list
		al.add(1, "Welcome21");
		System.out.println("elements after insertion: "+ al); //[100, Welcome21, O, 332.43, true]
		
		

	}

}
