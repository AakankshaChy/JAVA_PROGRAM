package javaBasics;
import java.util.*;

public class Leap {

	public static void main(String[] args) {
// java program that takes a year from user and print whether that year ia a leap year or not
	int year;
	System.out.println("Enter year ");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	 if (year % 400 == 0) {
		 System.out.println("leap year.");
	   }
	   // not a leap year if divisible by 100
	   // but not divisible by 400
	   else if (year % 100 == 0) {
		   System.out.println(" not a leap year.");
	   }
	   // leap year if not divisible by 100
	   // but divisible by 4
	   else if (year % 4 == 0) {
		   System.out.println("leap year.");
	   }
	   // all other years are not leap years
	   else {
		   System.out.println("not a leap year.");
	   }

	}

}
