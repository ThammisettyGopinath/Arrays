package com.Arrays;

public class AddOneDimArray {

	public static void main(String[] args) {
		int[] arr1= {4,6,5};
		int[] arr2= {2,4,3};
		int[] arr3=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		//System.out.println(arr3);
		for(int value : arr3)
		{
			System.out.print(value+" ");
		}
		

	}

}
