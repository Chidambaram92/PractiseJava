package com.pack.testtwo;

import java.util.HashMap;
import java.util.Set;

import java.util.Map.Entry;

public class CollectionsPractise {
	 public static void main (String[] args)
	   {
		//
		 testHaashMap();
		 getAllHashMap();
	   }
	 public static void testHaashMap() 
	 {
		 HashMap<Integer,String> arrHash= new HashMap<Integer,String>();
		 arrHash.put(1, "Green");
		 arrHash.put(2, "Yellow");
		 System.out.println("Entered Hash MAP" +arrHash);
		 Set<Integer>arrSet= arrHash.keySet();
		 for(int arrSetsElement:arrSet) {
			 System.out.println("After fetch value of Key " +arrSetsElement+" is:" +arrHash.get(arrSetsElement) );
		 }
	 }
	 public static void getAllHashMap() 
	 {
		 HashMap<String,String> hask= new HashMap<String,String>();
		 hask.put("One", "Yes");
		 hask.put("Two", "Ok");
		 System.out.println("Entered HASK is" +hask);
		 Set<Entry<String,String>>entries= hask.entrySet();
		 for(Entry<String,String>checker:entries){
			 System.out.println("Values " +checker.getKey()+ "and:" +checker.getValue());
		 }
	 }
	
}
