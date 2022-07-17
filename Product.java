package javaBasics;
import java.util.*;

public class Product {

	public static void main(String[] args) {
		// java program that takes two numbers as input
		//and display the products of two numbers.
		int num1,num2,prod;
		System.out.println("Enter two numbers ");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		prod=num1*num2;
		System.out.println("Products of two numbers are "+prod);
		
		

	}

}
