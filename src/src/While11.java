package src;

import java.util.Scanner;

public class While11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Display Numbers from 1 to 5 and 5 to 1:");
		
		// declare variables
	    int a = 1, b = 5;

	    // while loop from 1 to 5
	    while(a <= b) {
	      System.out.println(a);
	      a++;
	    }
		System.out.println("");
		// declare variables
	    int i = 1, n = 5;

	    // while loop from 1 to 5
	    while(n >= i) {
	      System.out.println(n);
	      n--;
	    }
		
				   System.out.println("");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("<<><><><><><><><><><><><><><><>>");
				   System.out.println("");
		
			  System.out.println("Sum of Positive Numbers Only:");

			   int sum = 0;

			    // create an object of Scanner class
			    Scanner input = new Scanner(System.in);

			    // take integer input from the user
			    System.out.println("Enter Positive number");
			    int number = input.nextInt();
				   
			    // while loop continues 
			    // until entered number is positive
			    while (number >= 0) {
			      // add only positive numbers
			      sum += number;

			      System.out.println("Enter anouther number or enters a negative number to sum");
			      number = input.nextInt();
			    }
				   
			    System.out.println("Sum = " + sum);
		
				   System.out.println("");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("<<><><><><><><><><><><><><><><>>");
				   System.out.println("");
			   
			   
				  System.out.println("Display Numbers from 1 to 5 do while:");

			   
				  int r = 1, m = 5;

				    do {
				      System.out.println(r);
				      r++;
				    } while(r <= m);
			   
				   System.out.println("");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("*<<><><><><><><><><><><><><><><>>*");
				   System.out.println("<<><><><><><><><><><><><><><><>>");
				   System.out.println("");
				  
				    int summ = 0;
				    int numberr = 0;

				    // create an object of Scanner class
				    Scanner inputt = new Scanner(System.in);
					   
				    // do...while loop continues 
				    // until entered number is positive
				    do {
				      // add only positive numbers
				      summ += numberr;
				      System.out.println("Enter a number");
				      numberr = input.nextInt();
				    } while(numberr >= 0); 
					   
				    System.out.println("Sum = " + summ);
				    input.close();
			   
					   System.out.println("");
					   System.out.println("*<<><><><><><><><><><><><><><><>>*");
					   System.out.println("*<<><><><><><><><><><><><><><><>>*");
					   System.out.println("<<><><><><><><><><><><><><><><>>");
					   System.out.println("");
			   
			   
				   
			   
						  System.out.println("Array using While Loop: ");

					    
					    
					    int[] agee = {12, 7, 8};
					    int index = 0;

					    while( index < agee.length ){
						      System.out.println(agee[index]);
						      index++;
					    }
			   
			   
			   
					    
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
	}

}
