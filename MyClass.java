package Lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int grade;
	int A = 3;
	int B =1;
	int C= 2;
	int F= 2;
	
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first grade");
		
		int user_input_number = scan.nextInt();
		
		System.out.println("Would you like to enter another grade(Y/N)");
		
		String user_input_string = scan.nextLine();
		
		System.out.println(user_input_string);
		
		System.out.println(" Hello! Enter a grade");
		
		
		
		System.out.println("Would you like to enter another grade(Y/N");
		
		String user_input_string1 = scan.nextLine();
		
	
		
		System.out.println(A + "" +"Students Recieved and A");
		
		System.out.println(B + " " + "Students Received an B");
		 
		System.out.println(C + " " +" Stusdents Received an C");
		
		System.out.println(F + " " +"Received an F");
		
		
	
 
        
		
		
	}

}
