package pack1;

public class A {
	
	
	public void m11() {
		System.out.println("i am ns m1");
		m2();
	}

	public static void m2() {
		System.out.println("i am s m2");
	}
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	public static void multiplication(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		A a1=new A();
		a1.m11();
		
		a1.addition(11, 22);
		multiplication(33, 33);
	}
}
