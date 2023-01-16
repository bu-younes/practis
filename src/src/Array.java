package src;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Using array:");

		// create an array
		   int[] age = {12, 4, 5, 2, 5};
			String[] name = { "mahir", "mrhoon", "mnal", "mnsoor"};

		   // access each array elements
		   System.out.println("First age: " + age[0]);
		   System.out.println("Second age: " + age[1]);
		   System.out.println("Third age: " + age[2]);
		   System.out.println("Fourth age: " + age[3]);
		   System.out.println("Fifth age: " + age[4]);
		   
		   
		   System.out.println("First Name: " + name[0]);
		   System.out.println("Second Name: " + name[1]);
		   System.out.println("Third Name: " + name[2]);
		   System.out.println("Fourth Name: " + name[3]);

		   System.out.println("");
		   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
		   System.out.println("");

		   
		   // create an array
		   int[] age1 = {12, 7, 8};

		   // loop through the array
		   // using for loop
		   System.out.println("Using array with for Loop:");
		   for(int i = 0; i < age1.length; i++) {
		     System.out.println("Age: " + age1[i]);
		   }
		
		   
		   
		   String[] name1 = {"Mohad","Nasir" , "Ali", "Mazin"};
		   
		   for (int s = 0; s < name1.length; s++) {
			     System.out.println("Name: " + name1[s]);
			   }
		   System.out.println("");
		   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
		   System.out.println("");

		   
		   
		   
		   // create an array
		   int[] age2 = {50, 14, 57};

		   // loop through the array
		   // using for loop
		   System.out.println("Using array with for-each Loop:");
		   for(int a : age2) {
		     System.out.println("Age: " + a);
		   }
		   
		   
		   
		   String[] name2 = {"msaood", "ahmed"};
		   for (String m : name2) {
System.out.println("Name: " + m);		   
		   }
		   
		   
		   System.out.println("");
		   System.out.println("*/-/-/-/-/-/-/-/-/-/-/-/-/-/-/*");
		   System.out.println("");
		   
		   
		   System.out.println("Compute Sum and Average of Array Elements:");

		   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		   int sum = 0;
		   Double average;
		   
		   // access all elements using for each loop
		   // add each element in sum
		   for (int number: numbers) {
		     sum += number;
		   }
		  
		   // get the total number of elements
		   int arrayLength = numbers.length;

		   // calculate the average
		   // convert the average from int to double
		   average =  ((double)sum / (double)arrayLength);

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		   
		   
		   
		   
	}

}
