package com.Arrays;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("enter string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
//		char[] ch=s.toCharArray();
//		
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		
		
		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1+=s.charAt(i);
//		}
//		System.out.println(s1);
//		
//		if(temp.equals(s1))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
//				System.out.println();
			}
			//System.out.println(count);
		}
		System.out.println(count);
		
		sc.close();

	}

}
