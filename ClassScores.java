package Lesson1;

import java.util.Scanner;

public class ClassScores {
 
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
          System.out.println("Enter Test grade: ");
          double test1 = scan.nextDouble();
           
          @SuppressWarnings("resource")
		Scanner response =  new Scanner(System.in);
          System.out.println("Would you like to enter another grade? (y/n");
          String r =  response.nextLine(); 
          System.out.println("you selected "+ r);
		
          System.out.println("Enter Test grade: ");
          double test2 = scan.nextDouble();
          
          System.out.println("Would you like to enter another grade? (y/n)");
          String p =  response.nextLine(); 
          System.out.println("You selected  " +p);
          double total = test1 + test2;
          double average = total/3;
         int highest = 100;
         int A = highest;
         int lowest=65;
         
          if(average>= 90){
          
        	  System.out.println("The average score for the class" + average);
          }else if(average >= 80) {
          System.out.println("The average score for the class that scored a B: "+ average);
             }else if(average >= 70) {
	       System.out.println("The average score for the class that scored a C: " + average);
          }else if(average >= 60) {
	       System.out.println("The average score for the class that scored a D: "+ average);
           }else {{
		  System.out.println("The average score for the class an F: " +average);
		  {{
			System.out.println("The highest score entered?"+ (A));
			System.out.println("The lowest score entered?" + lowest);
		  }
		  }
           }
           }
	}

}