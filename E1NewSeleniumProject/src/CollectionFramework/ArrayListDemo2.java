package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("X");
		al.add("W");
		al.add("A");
		al.add("Q");
		al.add("B");
		al.add("C");
		
		ArrayList dupal = new ArrayList();
		dupal.addAll(al);
		
		System.out.println(dupal); 	//[X, W, A, Q, B, C]
		
		dupal.removeAll(al);
		
		System.out.println("After remoing: "+dupal);
		
		// sort ..	Collections.sort
		
		System.out.println(al);		//[X, W, A, Q, B, C]
		Collections.sort(al);
		System.out.println("elements after sorting: "+al);
		
		//Collections.sort(al, Collections.reverseOrder());
		//System.out.println(al);
		
		
		Collections.reverse(al);
		System.out.println(al);
		
		//Shuffle
		Collections.shuffle(al);
		System.out.println(al);
	}

}
