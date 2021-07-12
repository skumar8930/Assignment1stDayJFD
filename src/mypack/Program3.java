package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String ss[])
	{
		List<Integer> list = Arrays.asList(30, 9, 28, 45, 4);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(name -> System.out.println(name));
	}


}
