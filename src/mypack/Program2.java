package mypack;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {
	
	
	public static void main(String ss[])
	{
		ArrayList<Integer> namesList = new ArrayList(Arrays.asList( 10, 5, 20,50) );
        
		namesList.forEach(name -> System.out.println(name));
	
	}

}
