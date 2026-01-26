package CollectionFrameworkInJava;

// import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class MapInJava {
    public static void main(String[] args){   
    	
//    	Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();
    	
    	students.put("Sumit",56);
    	students.put("Laksh",23);
    	students.put("Samay",67);
    	students.put("Arjun",92);
    	students.put("Yash",45);
    	
    	System.out.println(students.keySet());
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + " : " + students.get(key));
    	}
    	
    }
}

/*
package CollectionFrameworkInJava;

// Map → key–value data structure
// HashMap / Hashtable → concrete implementations of Map
import java.util.HashMap;
import java.util.Map;  
import java.util.Hashtable;

public class MapInJava {
    public static void main(String[] args){   
    	
        // Map Interface.
        // Stores data in key–value pairs.
        // Keys are UNIQUE, values can be duplicated.
        // If the same key is inserted again, the old value is REPLACED.

        // HashMap vs Hashtable.
        // HashMap.
        // NOT synchronized (not thread-safe)
        // Allows ONE null key and multiple null values
        // Faster, commonly used

        // Hashtable.
        // Synchronized (thread-safe)
        // Does NOT allow null key or null value
        // Older class (legacy), slower than HashMap

        
    	// Map<String, Integer> students = new HashMap<>();
    	Map<String, Integer> students = new Hashtable<>();
    	
        // put(key, value):
        // Adds a key–value pair to the map
        // If key already exists → value is overwritten

    	students.put("Sumit",56);
    	students.put("Laksh",23);
    	students.put("Sakshi",67);
    	students.put("Arjun",92);
    	students.put("Yash",45);

        // "Harsh" already exists → value 23 will be replaced by 45
    	students.put("Harsh", 45);
    	
        // keySet():
        // Returns a Set containing all the keys in the Map
        // Order is NOT guaranteed (depends on implementation)

    	System.out.println(students.keySet());
    	
        // Iterating over a Map:
        // Loop through keys
        // Use key to fetch corresponding value using get(key)

    	for (String key : students.keySet())
    	{
    		System.out.println(key + " : " + students.get(key));
    	}
    	
    }
}

*/