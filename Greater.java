package javaBasics;
import java.util.*;

public class Greater {

	public static void main(String[] args) {
		// Take three numbers from the users and print greatest number
        int num1,num2,num3;
        System.out.println("Enter the Three Numbers ");
        Scanner sc =new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1>num2) {
        	System.out.println(num1);
        }
        else {
        	if(num3>num2)
        	{
        		System.out.println(num3);
        	}
        	else {
        		System.out.println(num2);
        	}
        }

	}

}
