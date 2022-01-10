package com.app;

public class ReverseString {

	public static void main(String[] args) {
		String s1= "PAI";
		
		
		StringBuffer sb= new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		
		char[] ch= s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
			
		}

	}

}
