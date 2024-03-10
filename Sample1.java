package com.Arrays;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ThammisettyGopinath";
		
		char[] ch=s.toCharArray();
		int count=0;
		String str="";
		for(int i=0;i<ch.length;i++)
		{
			
			if((i%2==0))
			{
				
				str+=ch[i]; 
				if(ch[i]=='a')
				{
					count++;
				}
				
			}
			
			
		}
		System.out.println(str);
		System.out.println("\n");
		System.out.println("count : " + count);
		

	}

}
