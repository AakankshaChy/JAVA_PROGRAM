package javaBasics;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		// java program to swap two numbers
		int a,b;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		a =sc.nextInt();
		System.out.println("Enter second number ");
		b =sc.nextInt();
		System.out.println("first number before swapping " +a);
		System.out.println("second number before swapping " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("first number after swapping " +a);
		System.out.println("second number after swapping " +b);

	}

}
