package com.testpack.three;

import java.util.Scanner;

public class AdminTest {
	public static void main(String[] args) {
		String A="test"; String B= "admin"; 
		System.out.println((A+B).length());
		 System.out.println(A.compareTo(B)>0 ?"Yes":"No"); 
		 String Aref = A.substring(0,3);
String serf=A.substring(1);
System.out.println(Aref);
System.out.println(serf);
//		 B = B.substring(0,1).toUpperCase() + B.substring(1); 
//		 System.out.println(A+ " "+B);
		 
	//	revString();

	}

	public static void revString() {
		String actual, reverse;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		actual = sc.nextLine();
		reverse = "";
		for (int i = actual.length() - 1; i >= 0; i--) {
			reverse = reverse + actual.charAt(i);
		}
		System.out.println("Reversed String is: " + reverse);
	}

}
