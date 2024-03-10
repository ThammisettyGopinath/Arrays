package com.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		int[] i= {11,6,9,4,3,7};
		int max=i[0];
		for(int j=0;j<i.length;j++)
		{
			if(i[j]>max)
			{
				max=i[j];
			}
			//System.out.println(max);
		}
		
		System.out.println(max);
	}

}
