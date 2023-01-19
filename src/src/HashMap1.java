package src;
import java.util.Iterator;

import java.util.HashMap;
import java.util.HashSet;


public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Create HashMap in Java :");
		 
		// create a hashmap
		    HashMap<String, Integer> languages = new HashMap<>();

		    // add elements to hashmap
		    languages.put("Java", 1);
		    languages.put("JavaScript", 2);
		    languages.put("Python", 3);
		    System.out.println("The Languahe is: " + languages);
		 
		 System.out.println("");
		   System.out.println("*<<><><><><><><><><><><><><><><>>*");
		   System.out.println("*<<><><><><><><><><><><><><><><>>*");
		   System.out.println("");
		
		
		
		   
		   System.out.println("Add elements to a HashMap :");
		   
		   // create a hashmap
		    HashMap<String, Integer> numbers = new HashMap<>();

		    System.out.println("empty HashMap: " + numbers);
		    // put() method to add elements
		    numbers.put("One", 1);
		    numbers.put("Two", 2);
		    numbers.put("Three", 3);
		    System.out.println("HashMap after put(): " + numbers);
		    
		    
		  //we used int for call int value,this step for Access HashMap Elements
		    int value1 = numbers.get("One");
		    System.out.println("Value at index One: " + value1);
			 
			 System.out.println("");
			   System.out.println("*<<><><><><><><><><><><><><><><>>*");
			   System.out.println("*<<><><><><><><><><><><><><><><>>*");
			   System.out.println("");
			   
			   
			   
			   System.out.println("Access HashMap Elements :");
			   
			   HashMap<Integer, String> languages1 = new HashMap<>();
			    languages1.put(1, "Java");
			    languages1.put(2, "Python");
			    languages1.put(3, "JavaScript");
			    System.out.println("HashMap: " + languages1);

			    // get() method to get value
			    //we used string for call string value
			    String value = languages1.get(1);
			    System.out.println("Value at index 1: " + value);
			    
			    
			    
			    
			    /*We can also access the keys, values, and key/value pairs of the hashmap 
			     * as set views using keySet(),values(), and entrySet() methods respectively.
			     *  For example,*/
				 System.out.println("");

			    HashMap<Integer, String> languages2 = new HashMap<>();

			    languages2.put(1, "Java");
			    languages2.put(2, "Python");
			    languages2.put(3, "JavaScript");
			    System.out.println("HashMap: " + languages2);

			    // return set view of keys
			    // using keySet()
			    System.out.println("Keys: " + languages2.keySet());

			    // return set view of values
			    // using values()
			    System.out.println("Values: " + languages2.values());

			    // return set view of key/value pairs
			    // using entrySet()
			    System.out.println("Key/Value mappings: " + languages2.entrySet());
			     
				 
				 System.out.println("");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("");
				   
				   
				   
				   System.out.println("Change HashMap Value :");
				   
				   HashMap<Integer, String> languages3 = new HashMap<>();
				    languages3.put(1, "Java");
				    languages3.put(2, "Python");
				    languages3.put(3, "JavaScript");
				    System.out.println("Original HashMap: " + languages3);

				    // change element with key 1
				    languages3.replace(1, "C++");
				    System.out.println("HashMap using replace(): " + languages3);
					 
					 System.out.println("");
					   System.out.println("*<<><><><><><><><><><><><><><><>>*");
					   System.out.println("*<<><><><><><><><><><><><><><><>>*");
					   System.out.println("");
					   
					   
					   
					   
					   System.out.println("Remove HashMap Elements:");
					   
					   HashMap<Integer, String> languages4 = new HashMap<>();
					    languages4.put(1, "Java");
					    languages4.put(2, "Python");
					    languages4.put(3, "JavaScript");
					    System.out.println("HashMap: " + languages4);

					    // remove element associated with key 2
					    String value3 = languages4.remove(2);
					    System.out.println("Removed value: " + value3);

					    System.out.println("Updated HashMap: " + languages4);
						 
						 System.out.println("");
						   System.out.println("*<<><><><><><><><><><><><><><><>>*");
							 System.out.println("--------HashSet-------");
						   System.out.println("*<<><><><><><><><><><><><><><><>>*");
						   System.out.println("");
		
						   System.out.println(":");
							 
							 System.out.println("");
							   System.out.println("*<<><><><><><><><><><><><><><><>>*");
							   System.out.println("*<<><><><><><><><><><><><><><><>>*");
							   System.out.println("");
							   
							   
							   
							   System.out.println("Insert Elements to HashSet :");
							   
							   
							   HashSet<Integer> evenNumber = new HashSet<>();

						        // Using add() method
						        evenNumber.add(2);
						        evenNumber.add(4);
						        evenNumber.add(6);
						        System.out.println("HashSet: " + evenNumber);

						        HashSet<Integer> numbers1 = new HashSet<>();
						        
						        // Using addAll() method
						        numbers1.addAll(evenNumber);
						        numbers1.add(5);
						        System.out.println("New HashSet: " + numbers1);
								 
								 System.out.println("");
								   System.out.println("*<<><><><><><><><><><><><><><><>>*");
								   System.out.println("*<<><><><><><><><><><><><><><><>>*");
								   System.out.println("");
								   
								   
								   
								   System.out.println("Access HashSet Elements :");
								   
								   HashSet<Integer> numbers2 = new HashSet<>();
							        numbers2.add(2);
							        numbers2.add(5);
							        numbers2.add(6);
							        System.out.println("HashSet: " + numbers2);

							        // Calling iterator() method
							        Iterator<Integer> iterate = numbers2.iterator();
							        System.out.print("HashSet using Iterator: ");
							        // Accessing elements
							        while(iterate.hasNext()) {
							            System.out.print(iterate.next());
							            System.out.print(", ");
							        }
									 
									 System.out.println("");
									   System.out.println("*<<><><><><><><><><><><><><><><>>*");
									   System.out.println("*<<><><><><><><><><><><><><><><>>*");
									   System.out.println("");
									   
									   
									   
									   
									   System.out.println(":");
										 
										 System.out.println("");
										   System.out.println("*<<><><><><><><><><><><><><><><>>*");
										   System.out.println("*<<><><><><><><><><><><><><><><>>*");
										   System.out.println("");
										   
										   
										   
										   
										   System.out.println(":");
											 
											 System.out.println("");
											   System.out.println("*<<><><><><><><><><><><><><><><>>*");
											   System.out.println("*<<><><><><><><><><><><><><><><>>*");
											   System.out.println("");
			
		

	}

}
