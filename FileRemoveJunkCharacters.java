package com.pack.testtwo;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class FileRemoveJunkCharacters {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String readWord= sc.nextLine();
		System.out.println("Entered string is :" +readWord);
		sc.close();
		FileRemoveJunkCharacters most= new FileRemoveJunkCharacters();
		most.enterString(readWord);
		}
			
public void enterString(String inputWord) {
	String junkValue="#@$()!".concat(inputWord);
	System.out.println("Junk value is: " +junkValue);
	String normalValue= junkValue.replaceAll("[^a-zA-z0-9]", "");
	System.out.println("Normal values: "+normalValue);
	if(!(normalValue.equalsIgnoreCase(inputWord))) {
		throw new RuntimeException("Junk values not removed");
		
	}
	
}
}
