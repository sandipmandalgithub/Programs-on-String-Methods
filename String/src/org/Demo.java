package org;

public class Demo {
	public static void main(String[] args) {
		String s=new String("Java");
		System.out.println(s);//Java
		s.concat(s);
		System.out.println(s);//Java
		s=s.concat(" Program");
		System.out.println(s);//Java Program
		
		System.out.println("--*-----*-----*--");
		
		StringBuffer s1=new StringBuffer("Good");
		System.out.println(s1);//Good
		s1.append(" Afeternoon");
		System.out.println(s1);//Good Afternoon
		
		System.out.println("--*-----*------*--");
		StringBuilder s2=new StringBuilder("Hello");
		System.out.println(s2);//Hello
		s2.append(" World");
		System.out.println(s2);//Hello World
		System.out.println("--*-------*-------*--");
		
		String x=new String("Java");
		System.out.println(x+"-->"+x.length());//Java 4
		x.concat(" Programs");
		System.out.println(x+"-->"+x.length());//Java 4
		x=x.concat(" Programs");
		System.out.println(x+"-->"+x.length());//Java Programs 13
		
	}

}
