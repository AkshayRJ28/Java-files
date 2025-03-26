package collectionByED;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int gpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	public Student(String name, int gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
}

class MyObjectSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getGpa() - s2.getGpa()>0 ? 1 :
			   s1.getGpa() - s2.getGpa()<0 ? -1 :
			   s1.getGpa() - s2.getGpa()==0 ? s1.getName().compareTo(s2.getName()) : 0;
	}
	
}

public class SortObjectByComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = Arrays.asList(new Student("Ascharya",40),new Student("Akshay",40),new Student("Sandesh",10));
		
		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
		Collections.sort(students,comparator);
		//Collections.sort(students,new MyObjectSort());  // by using custom sort implementing comparator
		
		//students.sort(comparator); // can write this by using Comparator java 8 feature following code
//		students.sort((a1,a2)->{
//			if(a1.getGpa() - a2.getGpa() > 0)
//				return 1;
//			else if (a1.getGpa() - a2.getGpa() < 0)
//				return -1;
//			else {
//			    return a1.getName().compareTo(a2.getName());  // if equal GPA then sort by there name 
//			}
//		});
		System.out.println("Object sort by lamda expression by GPA : ");
		for(Student student : students) {
		   System.out.println("Name => "+student.getName() +",GPA => "+student.getGpa());
		}
		
//		1. What is the purpose of the Comparator interface in Java?
//				Answer:
//				The Comparator interface is used to define custom ordering for objects. 
//				It allows you to compare two objects and determine their ordering. 
//				This is especially useful when you want to sort objects in a way that differs from
//				their natural ordering (if they implement the Comparable interface).
		
//		2. How is Comparator different from Comparable?
//				Answer:
//
//				Comparable:
//				 Implemented by the class whose objects are to be compared.
//				 Uses the compareTo() method.
//				 Defines the natural ordering of the objects.
		
//				Comparator:
//				 Implemented as a separate class (or using lambda expressions).
//				 Uses the compare() method.
//				 Allows for multiple ways to order the same objects without modifying the object's class.
				
//		3. What does the compare() method return, and what do those return values indicate?
//				Answer:
//				 The compare() method returns:
//
//				 A negative integer if the first argument is less than the second.
//				 Zero if both arguments are equal.
//				 A positive integer if the first argument is greater than the second.

//        Use Comparator chaining with thenComparing().



	}

}
