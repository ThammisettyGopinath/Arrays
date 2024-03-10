package com.Arrays;

public class ArrayMinLengthWord {
	public static void main (String[] args) {
		
		//minimun length word
//		String[] arr= {"coffee","boost","tea"};
//		
//		int min=arr[0].length();
//		String word="";
//		for(int i=0;i<arr.length;i++)
//		{
//			
//			if(min>arr[i].length())
//			{
//				min=arr[i].length();
//				word=arr[i];
//			}
//		}
//		System.out.println(word);
		
		
		
		
		//max length word
		
		
		String[] arr= {"coffee","boost","tea"};
		
		int max=arr[0].length();
		String word="";
		for(int i=0;i<arr.length;i++)
		{
			
			if(max>=arr[i].length())
			{
				max=arr[i].length();
				word=arr[i];
			}
		}
		System.out.println(word);
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
