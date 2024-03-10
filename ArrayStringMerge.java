package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringMerge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st Array : ");
		int size1=sc.nextInt();
		
		System.out.println("Enter size of 2st Array : ");
		int size2=sc.nextInt();
		
		
		System.out.println("Enter 1st Array elements : ");
		String[] arr1=new String[100];
		for (int i=0;i<=size1;i++)
		{
			arr1[i]=sc.nextLine();
		}
		
		
		System.out.println("Enter 2st Array elements : ");
		String[] arr2=new String[100];
		for (int j=0;j<size2;j++)
		{
			arr2[j]=sc.nextLine();
		}
		
		
		String[] arr3=new String[size1 + size2];
		
		
		for(int i=0;i<=size1;i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int j=0;j<size2;j++)
		{
			arr3[j+size1]=arr2[j];
		}
		//System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
		
		sc.close();
		

	}

}
