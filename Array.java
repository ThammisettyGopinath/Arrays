package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of 1st Array : ");
		int size1=sc.nextInt();
		
		
		System.out.println("Enter size of 2nd Array : ");
		int size2=sc.nextInt();
		
		
		System.out.println("Enter 1st Array elements : ");
		int[] arr1=new int[100];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter 2nd Array elements : ");
		int[] arr2=new int[100];
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		int[] arr3=new int[size1+size2];
		
		
		for(int i=0;i<size1;i++)
		{
			arr3[i]=arr1[i];
		}
		
		
		for(int i=0;i<size2;i++)
		{
			arr3[i+size1]=arr2[i];
		}
		
		System.out.println(Arrays.toString(arr3));
		
		
		
		sc.close();
	}

}
