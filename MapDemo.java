package Java_concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.sun.jdi.Value;

public class MapDemo {
	public static void main (String args[]) {
		// Key characteristics of map Interface 
		// 1.Key value pairs 2.unique Keys 3.Value per pair
		// 4.order -> some implementation maintain insertion order(Linked Hash Map), Natural Order(TreeMap), or no order (HashMap)
		
		//1.HashMap
		// unordered
		// allow one null key and multiple null values
		// Not Synchronized : Not thread safe
		// Performance : 0(1) for -> get, put 
		HashMap<Integer, String> students = new HashMap<>();
		students.put(1, "jai");
		students.put(2,"Veeru");
		students.put(null, null);
		students.put(null, "Replacing null value of key null");  // if same key used while putting new value then new value override old one.
		
		System.out.println("Printing HashMap by Key : "+students.get(1));           // jai
		System.out.println("Printing HashMap by Key : "+students.get(23));          // null
		System.out.println("Contains Key check : "+ students.containsKey(2));       // true
		System.out.println("Contains Value check : "+ students.containsValue("jai")); // true
		System.out.println("Remove by Key : "+students.remove(2));                   // Veeru
		
		// getKeySet from the Map
		Set<Integer> keysOfStudents = students.keySet();
		System.out.print("Keys of Student are : ");
		for(Integer i: keysOfStudents) {
			System.out.println(i+" ");
		}
		
		// iterate Map 
		Set<Map.Entry<Integer, String>> entries = students.entrySet();
		for(Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			entry.setValue(entry.getValue().toUpperCase());   // we can update while iterating in entry set 
		}
		System.out.println(students);
		
		// Internal Structure of the HashMap => 
		// Basic Components of HashMap
		//  1. Key => The identifier used to retrieve the value
		//  2. value => The associate with key 
		//  3. Bucket => Internal Array where key and value are stored.
		//  4. HashFunction => Convert key into a index (bucket location) for storage.
		//                  => Is a algorithm that takes a input (Key) and returns a fixed size length of the string of bytes,
		//                     Typically numerical Value.class output is known as hashCode, hash value, or simply hash.
		//     Key Characteristics of hashCode => 
		//     1. Deterministic => The same input always produce same output.
		//     2. Fixed output size => regardless of input size, hashCode has consistent size (32-bit or 64-bit)
		//     3. Efficient Computation => The hash function should compute the hash quickly.
		
		// How Data stored in hash function ?
		// step 1: Hashing the key =>
		//         first, the Key is passed to hashFunction to generate the unique hashCode(an integer number)
		//         This hashCode determine where the Key-Value pair will be stored in the array (called bucket array).
		//
		// step 2: Calculating the index => 
		//         The hashCode is used to calculate an index in array (bucket location) using -> int index = hashCode % arraySize(by default 16);
		//         The index will decides which bucket will hold this key-Value pair
		//         For Example -> if array size is 16 then, hashCode will be divided by the 16 and remainder will be the index. 
		//
		// step 3: Storing in bucket =>
		//         The Key-Value pair is stored at the calculated index. Each bucket can holds multiple Key-Value pairs (Collision handling Mechanism).
		//
		// Example : map.put("apple",50)
		//           1. "apple" is the key. 50 is value. HashCode of "apple" is calculated.
		//           2. index is founded by using hashCode 
		//           3. The pair ("apple",50) is stored in the corresponding bucket. 
		
		// How HashMap retrieves a data?
		//  when we call get(key) => the hashCode follows these steps
		//  1. Hashing the key : similar like insertion, key is hashed using same hash Function to calculate hash code
		//  2. Finding Index  : The hashCode is used to find the index of bucket where the Key-Value pair is stored.
		//  3. Searching in the Bucket : Once the correct index is found it checks for the key in that bucket. If it finds, return its value.
		//     At the index of bucket there is a linked list to store a key_value pair, in case of collision, next Key-value pair stored at same index 
		//     of bucket but in linked list.
	}

}
