package com;

public class Demo {
	public static void main(String[] args) {
		String s=new String("A");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("--------");
		
		System.out.println(s.hashCode());
		System.out.println("-----------");
		
		String s1=new String("java");
		String s2=new String("java");
		System.out.println(s1.equals(s2));//COMPARE TWO DATA/CONTENT	
		System.out.println(s1==s2);//COMPARE TWO ADDRESS/REFERENCES
		
		
		
		
		
	}

}
