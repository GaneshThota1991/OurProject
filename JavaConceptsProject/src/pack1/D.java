package pack1;

public class D {
	
	public void m1() {
		System.out.println("i am ns m1");
		m3();
	}

	public static void m2() {
		System.out.println("i am s m2");
		m4();
	}
	
	public void m3() {
		System.out.println("i am ns m3");
	}
	
	public static void m4() {
		System.out.println("i am s m4");
	}
	
	public static void main(String[] args) {
		m2();
	}

}
