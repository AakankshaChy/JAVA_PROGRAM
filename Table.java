package javaBasics;
import java.util.*;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,table=1;
		System.out.println("Enter the Number ");
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("The table of "+n);
		
		for( i=1;i<=10;i++) {
			table = n*i;
			
			System.out.println(n +"*"+i+" = " + table);
		}
		

	}

}
