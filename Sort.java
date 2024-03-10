package com.Arrays;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		System.out.println("Enter size : ");
		Scanner sc=new Scanner(System.in);

		int size=sc.nextInt();
		
		System.out.println("Enter elements : ");
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
//		int temp;
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])//Assending Order
				{						//if we want adecending order put {<}
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
