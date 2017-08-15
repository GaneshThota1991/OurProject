package pack4;

public class Test {
	
	public static void main(String[] args) {
		/*ParameterizedMethodCalling p=new ParameterizedMethodCalling();
		System.out.println("*****My Friend Details");
		p.familyDetails("Hi", "Java", (byte) 23);
		System.out.println("\n\n");
		System.out.println("******My Details*****");
		p.familyDetails("Hello", "oops", (byte) 21);*/
		
		System.out.println("*****My Friend Details");
		ParameterizedMethodCalling.familyDetails("Hi", "Java", (byte) 23);
		System.out.println("\n\n");
		System.out.println("******My Details*****");
		ParameterizedMethodCalling.familyDetails("Hello", "oops", (byte) 21);
	}


	
}
