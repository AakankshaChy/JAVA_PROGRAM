package javaBasics;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// java program to print the area and perimeter of circle
		double radius;
		System.out.println("Enter the Radius of circle ");
		Scanner sc=new Scanner(System.in);
		radius = sc.nextDouble();
		double area = 3.14*radius*radius;
		double perimeter =2*3.14*radius;
		System.out.println("Area of circle is "+area);
		System.out.println("perimeter of circle is "+perimeter);


	}

}
