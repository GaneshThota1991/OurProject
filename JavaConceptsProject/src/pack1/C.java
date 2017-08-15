package pack1;

public class C {

	public void m1() {
		System.out.println("i am ns m1");
		
	}

	public static void m2() {
		C c=new C();
		c.m1();
		System.out.println("i am s m2");
	}
	public static void m3() {
		C c=new C();
		c.m1();
		System.out.println("i am s m2");
	}
	
	public static void main(String[] args) {
		
		m2();
	}
}
