package com.Arrays;

import java.util.Scanner;

public class ArrayMaxDynamic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size=sc.nextInt();
		
		System.out.println("Enter elements of an Array : ");
		int[] arr=new int[100];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int index=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
				index=i;
				
			}
			
		}
		System.out.println("Max value of an Array is : "+ max);
		System.out.println("index value is : " + index); 
		
		sc.close();
	}

}
