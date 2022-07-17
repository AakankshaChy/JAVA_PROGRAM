package javaBasics;
import java.util.*;

public class Measurement {

	public static void main(String[] args) {
		// java program that read a number in inches converts it to meter
		double inches;
		System.out.println("enter the number in inches ");
		Scanner sc = new Scanner(System.in);
		inches = sc.nextDouble();
		Double meter = inches/39.3700787;
		System.out.println("Number in Meter "+meter);
		

	}

}
