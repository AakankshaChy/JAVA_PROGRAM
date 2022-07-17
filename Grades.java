package javaBasics;
import java.util.*;

public class Grades {

	public static void main(String[] args) {
		// java program to grade students based on their marks
		float marks;
		System.out.println("Enter the Marks of student");
		Scanner sc = new Scanner (System.in);
		marks = sc.nextFloat();
		if(marks>90) {
			System.out.println("A+ GRADE");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("A GRADE");
			
		}
		else {
			 
					System.out.println("C GRADE");
				
		}
		
			
		

	}

}
