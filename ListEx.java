package Java_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {
	
	
	public static void main(String args[]) {
		ArrayList<Integer> listCapacity= new ArrayList<>(10);  // Initial capacity 10 -> after adding 11 then only resize size of 10 * 1.5 
		System.out.println(listCapacity.size());   // 0
//	    System.out.println(listCapacity.get(0));   // index not out of bound exception because length 0 just capacity 10 not length
                                                   // we can get capacity size by using reflection 
		ArrayList<Integer> list= new ArrayList<>();  // before adding into it it has default capacity is 10 for store element 
		list.add(1);
		list.add(3);
		list.add(5);
		
	    /* => Three steps happens when add a elements in a arrayList 
	     * 
		 * 1. check capacity      : check if there is enough space in internal array (elementData), if it is full then it need to resize. 
		 * 2. Resize if necessary : if internal array full, then arrayList will create new array with larger capacity (1.5 time of current capacity)
		 *                          and copy the old elements into new array. 
		 * 3. add new element     : The new element is then added to internal array at appropriate index, and size will be incremented. 
		 * 
		 * */
		
		// In details Resizing the array => 
		// 1.Initial capacity : default capacity is 10 for store element, that means it can hold 10 elements before it need to grow.
		// 2.Growth factor    : when internal array is full with capacity then new array is created with 1.5 times larger size than old array. 
        //                    this growth factor balances memory efficiency and resizing cost
		// 3.Copying Element  : when resizing occurs all old array element copied into newly created array, which takes O(n) operations.
		
		list.remove(2);                    // removes index element
		list.remove(Integer.valueOf(1));   // removes first actual occurred value from list
		// Removing element from the arrayList 
		// 1.check bounds : The arrayList checks if the index is within valid in range
		// 2.Remove the Element : The element is removed, and all elements to right of the removed element shifted one position to left to fill gap.
		// 3.Reduce size : The size is decremented by one.
		
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		// using pointer
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
		// using for each loop
//		for(int i : list) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println(list.contains(3));
//		System.out.println(list.contains(15));
		
		List<String> listOfNoramlArraylist= new ArrayList<>();
		System.out.println(listOfNoramlArraylist.getClass().getName());             // java.util.ArrayList 
		
		List<String> month = Arrays.asList("Jan","Feb","March");
		System.out.println(month.getClass().getName());          // java.util.Arrays$ArrayList
		
		String []  arr = {"Jan", "feb"};     
//		ArrayList<String> months = Arrays.asList(arr);           // can't because returned List that is parent class, ArrayList is child class  
		List<String> months = Arrays.asList(arr);               
		System.out.println(months.getClass().getName());         // java.util.Arrays$ArrayList
		
//		List<String> monthCopy = Arrays.asList(months);          // if you want modify then create new list and pass old list into argument 

		
	    // Arrays$ArrayList =>  it is nested static private class so you can't add more element into list or remove which is created by asList
//		months.add("march");     // java.lang.UnsupportedOperationException occurs because returns a fixed size list we can't modify it 
		months.set(0, "Feb");    // so we can set replace element 
		
		// from new java version list of 
		List<Integer> list3=List.of(1,2,3,4);                    // unmodified list, can't update,add,remove 
		
		// => Time complexity 
		
		// 1. access by index (get) is O(1)
		// 2. Adding of element is O(n) because it may involves shifting elements
		// 3. Removing of element is O(n) because it may involves shifting elements
		// 4. Iteration is O(n)
	}

}
