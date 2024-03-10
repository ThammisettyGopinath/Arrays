package com.Arrays;

import java.util.ArrayList;

public class DuplicateValues {

	public static void main(String[] args) {
		int[] a= {1,3,7,4,2,3,4,6,3};
		
		ArrayList<Integer> al=new ArrayList<> ();
		
		
		for(int i=0;i<a.length;i++)
		{
			if(al.contains(a[i]))
			{
				continue;
			}
			al.add(a[i]);
		}
		System.out.println(al);
			

	}

}
