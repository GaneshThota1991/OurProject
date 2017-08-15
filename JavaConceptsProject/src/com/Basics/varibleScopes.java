package com.Basics;

public class varibleScopes {
	int b=100;// instance variable === global variable
	static int m=90;// static variable
  static int a;
  static byte bt;
  static String st;	
  static char ch;
  static float ft;
  static long l;
  static double d;
  static boolean bb;
  
	public void localMth() {
		int a = 10 ; //local variable 
		System.out.println(a);

	}

	public void localMth2() {
		
	}

	public static void main(String[] args) {
		
		System.out.println(bb);

	}

}
