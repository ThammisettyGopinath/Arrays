package com.Arrays;

import java.util.Scanner;

public class DynamicSquareArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();
		
		System.out.println("Enter Elements : ");
		int[] Arr= new int[100];
		
		for(int i=0;i<size;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{ 
			Arr[i]=Arr[i]*Arr[i];
			System.out.print(Arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}

}
