package pack1;

public class B {
	A A1=new A();
	public void m1() {
		
				A1.m11();
		m2();

		System.out.println("i am ns m1");

	}

	public static void m2() {
		System.out.println("i am s m2");
	}
	public void m3() {
		
				A1.m11();
		m2();

		System.out.println("i am ns m1");

	}


	public static void main(String[] args) {
		B b = new B();
		b.m1();
		// m2();
	}
}
