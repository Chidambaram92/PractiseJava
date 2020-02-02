package com.pack.test;

import java.util.Scanner;

public class SearchNumber 
{
	public static void main(String[] args) {
		System.out.println("Tested successfully");
		int count=10, sum = 0;
		for(int i=1;i<=count;i++)
		{
			sum= sum+i;
		}
		System.out.println("Sum of natural numbers is : " +sum);
		SearchNumber objOne= new SearchNumber();
		objOne.getSearcher();
	}

	public void getSearcher() {
		int num,i,searchElement,array[];
		System.out.println("Get user inputs FOR NO OF ELEMENTS FOR THE program");
		Scanner sc= new Scanner(System.in);
		num =sc.nextInt();
		array= new int[num];
		System.out.println("Enter the numbers:"+"\n");
		for(i=0;i<num;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter search value");
		searchElement=sc.nextInt();
		for(int j=1;j<num;j++) {
			if(array[j]==searchElement) {
				System.out.println("Search element is found at : "+(j+1)+ " position ");
			}
		}
	}
}