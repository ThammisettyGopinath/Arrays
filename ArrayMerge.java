package com.Arrays;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		int[] a={1,7,5,4,3};
		int[] b= {5,3,2};
		int[] c=new int[a.length+b.length];//5+3=8
		for (int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}//{1,7,5,4,3,0,0,0}
		for (int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(c));
		
	}

}
