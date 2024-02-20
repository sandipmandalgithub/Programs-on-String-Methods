package com;
//STRING METHODS PRESENT IN STRING CLASS
public class StringMethods {
	public static void main(String[] args) {
		String s="Software Engineer";
		System.out.println(s.length());//17
		System.out.println(s.toLowerCase());//software engineer
		System.out.println(s.toUpperCase());//SOFTARE ENGINEER
		System.out.println(s.charAt(2));//f
		System.out.println(s.contains("ware"));//true
		System.out.println(s.indexOf('e'));//7
		System.out.println(s.indexOf('d'));//-1
		
		System.out.println("----------------");
		String s1="Java";
		System.out.println(s1.substring(1));//ava
		System.out.println(s1.substring(0,3));//Jav
		
		System.out.println("---------------");
		String s2="java";
		String s3="java";
		String s4="JaVa";
		System.out.println(s2.endsWith(s3));//true
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
		
	}

}
