package collectionByED;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> copyList = new CopyOnWriteArrayList<>();
		// when we do copy on write operation (delete or add)
		// instead of modifying current list it create new list to copy of element of added or removed element
		// this ensures that threads reading current list is not disturbed or affected
		
		// Read Operation: Fast and Direct, since they happen on the stable list without interference from modifications
		// write Operation: New copy of the list created every time when added a element or removed 
	    //                  Reference to list is then updated to new list, so they can read from new list
		// used when read more
		// it is single threaded
		
//		ArrayList<String> copyList = new ArrayList();
		copyList.add("Eggs");
		copyList.add("Butter");
		copyList.add("Bread");

		for(String i : copyList) {
			if(i.equals("Butter")) {
				copyList.add("New item");
				System.out.println("New item added successfully!");
				// if used list here exception occurs when adding new element while iterating
				// Exception in thread "main" java.util.ConcurrentModificationException
			}
			System.out.println(i);
		}
		
	}

}
