package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
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
		
		//retrive a specific element from array list
		System.out.println(al.get(3));	//332.43 '3' is index
		
		//Replace element
		al.set(1, "C#");
		System.out.println("After replacing element: "+al);
		
		//Verify particluar element is present- contains()-true or false
		System.out.println("C# is in the list: "+al.contains("C#"));
		
		//isEmpty() - true or false
		System.out.println(al.isEmpty());
		
		//for loop
		System.out.println("Reading elements using for loop");
		for(int i=0; i<al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
		//for.. each loop
		System.out.println("Reading elements using for-each loop");
		for(Object e : al) 
		{
			System.out.println(e);
		}
		
		//iterater method
		System.out.println("Reading elements using Iterator");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
