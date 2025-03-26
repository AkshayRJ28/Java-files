package collectionByED;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.length() - s2.length(); // if you want to descending then only change the order => s2.length() - s1.length()
		// if return positive => s2 come before..
		// if return negative => s1 come before..
	}
	
}

class MyComparatorAsc implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		
		return num1 - num2;  // num1=>5 num2=>3 if return a positive number then num1 should be come before num2 (ascending Order) 
	}
	
}

class MyComparatorDsc implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		
		return num2 - num1;  // num1=>5 num2=>3 if return a negative number then num2 should be come before num1 (descending Order) 
	}
	
}

public class Comparator_Example { 

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,2,5,4,6);
		numbers.sort(new MyComparatorAsc());
		System.out.println("Sorted numbers List Ascending by using custom Comparator: "+numbers);
		
		numbers.sort(new MyComparatorDsc());
		System.out.println("Sorted numbers List Descending by using custom Comparator: "+numbers);
		
		List<String> month = Arrays.asList("Jan","Feb","March");
		month.sort(new StringLengthComparator());
		System.out.println("Sorted Months List of string length Ascending by using custom Comparator: "+month);
		
		// descending sort by using lambda expression 
		month.sort((s1,s2)->{return s2.length() - s1.length();});
		System.out.println("Sorted Months List of string length Descending by lambda expression : "+month);

	}

}
