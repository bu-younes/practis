package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.out.println("Using  ArrayList :");
		  
		// create ArrayList
		  ArrayList<String> languages = new ArrayList<>();
	    // Add elements to ArrayList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Swift");
	    System.out.println("ArrayList: " + languages);
		// create ArrayList
		  ArrayList Numbers = new ArrayList<>();
	    // Add elements to ArrayList
		  Numbers.add(1);
		  Numbers.add(2);
		  Numbers.add(3);
	    System.out.println("ArrayList Numbers: " + Numbers);
	    
		   System.out.println("");
		   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
		   System.out.println("");
		
		   
		   
		   
		   
		   
		   
			  System.out.println("Access ArrayList Elements:");

		   ArrayList<String> animals = new ArrayList<>();

		    // add elements in the arraylist
		    animals.add("Cat");
		    animals.add("Dog");
		    animals.add("Cow");
		    System.out.println("ArrayList: " + animals);
		    // get the element from the arraylist
		    String str = animals.get(2);
		    System.out.print("Element at index : " + str+"\n");
		    
		    
		    ArrayList numbers1 = new ArrayList<>();
			  numbers1.add(11);
			  numbers1.add(22);
			  numbers1.add(33);
			  int strr = (int) numbers1.get(1);
			  System.out.print("Element at index : " + strr);
		   
			  
			   System.out.println("");
			   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
			   System.out.println("");
			  
			  
			   
			   
			   
			   
			   
			   
			   
				  System.out.println("Change ArrayList Elements:");
				  
			    ArrayList<String> languagess = new ArrayList<>();

			    // add elements in the array list
			    languagess.add("Java");
			    languagess.add("Kotlin");
			    languagess.add("C++");
			    System.out.println("ArrayList: " + languagess);

			    // change the element of the array list
			    languagess.set(2, "JavaScript");
			    System.out.println("Modified ArrayList: " + languagess);
			   
			   
			    ArrayList numbers2 = new ArrayList<>();
			    numbers2.add(1);
			    numbers2.add(2);
			    numbers2.add(3);
			    System.out.println("ArrayList: " + numbers2);
			    numbers2.set(1, 7);
			    System.out.println("ArrayList: " + numbers2);

				   System.out.println("");
				   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
				   System.out.println("");
			    
			    
				   
				   
				   
				   
				   
				   
				   
				  System.out.println("Remove ArrayList Elements:");
				  
				  ArrayList<String> animals1 = new ArrayList<>();

				    // add elements in the array list
				    animals1.add("Dog");
				    animals1.add("Cat");
				    animals1.add("Horse");
				    System.out.println("ArrayList: " + animals1);
					   System.out.println("");
				    // remove element from index 2
				    String str1 = animals1.remove(2);
				    System.out.println("Updated ArrayList: " + animals1);
				    System.out.println("Removed Element: " + str1);
			    
				    ArrayList numbers3 = new ArrayList<>();
				    numbers3.add(2);
				    numbers3.add(9);
				    numbers3.add(11);
				    System.out.println("ArrayList: " + numbers3);
				    int str2 = (int) numbers3.remove(1);
				    System.out.println("Updated ArrayList: " + numbers3);
				    System.out.println("Removed Element: " + str2);

					   System.out.println("");
					   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
					   System.out.println("");

					   
					   
					   
					   
					   
					   
					   
					  System.out.println("Iterate through an ArrayList:");
					  
					// creating an array list
					    ArrayList<String> animals2 = new ArrayList<>();
					    animals2.add("Cow");
					    animals2.add("Cat");
					    animals2.add("Dog");
					    System.out.println("ArrayList: " + animals2);
					    // iterate using for-each loop
					    System.out.println("Accessing individual elements:  ");

					    for (String language : animals2) {
					      System.out.print(language);
					      System.out.print(", ");
					    }

			   
					    
					    ArrayList<Integer> nu = new ArrayList<>();
					    nu.add(5);
					    nu.add(89);
					    System.out.println("ArrayList: " + nu);
					    System.out.println("Accessing individual elements:  ");
					    
					    for (int num : nu) {
					    	  System.out.print(num);
						      System.out.print(", ");
						    }
					    
					    
						   System.out.println("");
						   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
						   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
						   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
						   System.out.println("");
					    
						   
						   
						   
						   
						   
						   
						   
						   
							  System.out.println("Java LinkedList as Queue:");

						   Queue<String> languages8 = new LinkedList<>();

						    // add elements
						    languages8.add("Python");
						    languages8.add("Java");
						    languages8.add("C");
						    System.out.println("LinkedList: " + languages8);

						    // access the first element
						    String str15 = languages8.peek();
						    System.out.println("Accessed Element: " + str15);

						    // access and remove the first element
						    String str25 = languages8.poll();
						    System.out.println("Removed Element: " + str25);
						    System.out.println("LinkedList after poll(): " + languages8);

						    // add element at the end
						    languages8.offer("Swift");
						    System.out.println("LinkedList after offer(): " + languages8);
					    
					    
					    
					    
					    
							   System.out.println("");
							   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
							   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
							   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
							   System.out.println("");
							   
							   
							   
							   
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
	}

}
