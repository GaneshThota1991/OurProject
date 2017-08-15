package com.Basics;

public class IfStatMnts {
	
	static int age=10;
	static int marks=10;
	public static void main(String[] args) {
		// if -else Statement
		if(age>18) {
			
			System.out.println("eligible for Vote");
		}
		else {
			System.out.println("not eligible for Vote");
		}
		
		
		// Nested If or If-else ladder
		
		if(marks>75) {
			System.out.println("Passed in distinction Class");
		}
		
		else if(marks>60&&marks<75) {
			System.out.println("Passed in first Class");
		}
		else if (marks>45&&marks<60) {
			System.out.println("passed in Second Class");
		}
		else if(marks>34 && marks<45) {
			System.out.println("passed in Third Class");
		}
		else {
			System.out.println("Failed");
		}
		
	}

}
