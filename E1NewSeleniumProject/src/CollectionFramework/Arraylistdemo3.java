package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"Dog","Cat","Shep"};
		
		for(String value : arr)
		{
			System.out.println(value);
		}
		
		
		//converting array into array list
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}

}
