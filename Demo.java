package com.Arrays;

import java.util.*;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Map<Integer,String> a=new Hashtable<>();
		a.put(101, "Gopi");
		a.put(37, "John");
		a.put(219, "Rebecca");
		a.put(49, "Giya");
		a.put(105, "siya");
		
		//System.out.println(a);
		//Retrieval of values from the map
		
		
		
//		Collection<String> values=a.values();
//		for(String value : values)
//		{
//			System.out.println(value);
//		}
		
		
		
		//Retrieval of keys
		Set<Integer> keys=a.keySet();
		for(Integer key : keys)
		{
			System.out.println(key);
		}
		
		
		
				

	}

}
