package CollectionFrameworkInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


//class Student implements Comparable<Student>
class Student
{
	int age;
	String name;
	
	public Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}
	
//	public int CompareTo(Student that)
//	{
////		return 0;
//		if(this.age > that.age)
//			return 1;
//		else
//			return -1;
//	}
}
	

public class SortingInJava {
    public static void main(String[] args){   
    	
//    	Comparator<Integer> com = new Comparator<Integer>()
//    	{
//    		public int compare(Integer i,Integer j)
//    		{
//    			if(i%10 > j%10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};	
    	
//    	List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);
    	
//    	Comparator<Student> com=new Comparator<Student>()
//    	{
//    		public int compare(Student i,Student j)
//    		{
//    			if(i.age > j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};	
    	
    	Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;
     	
    	List<Student> studs= new ArrayList<>();
    	studs.add(new Student(21,"Sumit"));
    	studs.add(new Student(12,"Rahul"));
    	studs.add(new Student(18,"Raghav"));
    	studs.add(new Student(20,"Shanvi"));
    	
//    	Collections.sort(nums);
//    	System.out.println(nums);
    	
    	for(Student s:studs)
    		System.out.println();
    	
    	Collections.sort(studs);
    	for(Student s: studs)
    		System.out.println(s);
    }
}


// Complete understanding and example of this sorting.

/*
package CollectionFrameworkInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// Student class.
// Represents a custom object to be stored inside a Collection.
// Used to demonstrate sorting of user-defined objects.
//
// IMPORTANT.
// To sort custom objects, Java needs comparison logic.
// This can be provided using.
// 1) Comparable  → natural/default ordering (inside class).
// 2) Comparator  → custom/external ordering (outside class).

// class Student implements Comparable<Student>
class Student
{
	int age;
	String name;

	// Constructor.
	// Used to initialize Student objects.
	public Student(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	// toString().
	// Automatically called when object is printed.
	// Helps display meaningful output instead of memory reference.
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	// Comparable approach (commented).
	// Used when the class itself defines natural sorting order.
	// Requires implementing Comparable<T>.
	
	// Rules.
	// return +ve → current object is greater.
	// return -ve → current object is smaller.
	// return 0   → both objects are equal.

//	public int compareTo(Student that)
//	{
//		if (this.age > that.age)
//			return 1;
//		else
//			return -1;
//	}
}

public class SortingInJava {
    public static void main(String[] args){   

    	// Comparator Interface.
    	// Used for custom sorting logic.
    	// Does NOT require modifying the class.
    	// Preferred when multiple sorting strategies are needed.

    	// Comparator<Integer> example (commented):
    	// Sorts integers based on last digit
//    	Comparator<Integer> com = new Comparator<Integer>()
//    	{
//    		public int compare(Integer i, Integer j)
//    		{
//    			if (i % 10 > j % 10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

    	// Comparator<Student> example (commented).
    	// Sorts Student objects based on age.
//    	Comparator<Student> com = new Comparator<Student>()
//    	{
//    		public int compare(Student i, Student j)
//    		{
//    			if (i.age > j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

    	// Lambda expression.
    	// Shorter and cleaner way to implement Comparator.
    	// Comparator is a functional interface (only one abstract method).
    	Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

    	// List of Student objects:
    	// ArrayList stores custom objects
    	List<Student> studs = new ArrayList<>();
    	studs.add(new Student(21, "Sumit"));
    	studs.add(new Student(12, "Rahul"));
    	studs.add(new Student(18, "Raghav"));
    	studs.add(new Student(20, "Shan"));

    	// Before sorting.
    	// Elements are in insertion order.
    	for (Student s : studs).
    		System.out.println(s);

    	// Collections.sort().
    	// Used to sort List elements.
    	//
    	// Requirement.
    	// - Elements must implement Comparable.
    	//   OR
    	// - A Comparator must be provided.
    	//
    	// Here.
    	// Student does NOT implement Comparable.
    	// So Comparator is mandatory.
    	Collections.sort(studs, com);

    	// After sorting:
    	// List is sorted based on age
    	for (Student s : studs)
    		System.out.println(s);
    }
}

*/