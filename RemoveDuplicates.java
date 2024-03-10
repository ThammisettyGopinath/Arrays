package com.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr =new int[] {4,6,2,8,6,3,1,4,6};
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(arr[i]+" ");
				
			}
		}

	}

}
