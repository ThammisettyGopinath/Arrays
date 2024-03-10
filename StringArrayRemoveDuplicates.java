package com.Arrays;

public class StringArrayRemoveDuplicates {

	public static void main(String[] args) {
		String[] arr=new String[] {"Apple","Banana","Strwberry","Apple","Banana","Apple"};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
			//		System.out.print(arr[j]+" ");
				}
			}
			if(count==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
