package com.pack.testtwo;

public class MissingNumbers 
{
public static void main(String[] args) {
	int arrayNum[]= new int[5];
	arrayNum[0]=1;
	arrayNum[1]=2;
	arrayNum[2]=3;
	arrayNum[3]=4;
	arrayNum[4]=6;
	int sum=0;
	for(int i=0;i<arrayNum.length;i++) 
	{
		
		sum+=arrayNum[i];
	
	}	System.out.println("First Sum is: " +sum);
	int sumOne=0;
	for(int j=1;j<=6;j++) {
		sumOne=sumOne+j;
		
	}System.out.println("Final Sum is: " +sumOne);
	int missNum= sumOne-sum;
	System.out.println("Missing num is: "+missNum);
	// Get index values
//	int initialVal=arrayNum.toString().indexOf(3);
//	System.out.println("Got: " +initialVal);
}
}
