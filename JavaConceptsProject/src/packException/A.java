package packException;

public class A {

	
	
	public void m(int a, int b) {
		System.out.println("Hello");
		try {
		System.out.println(a/b);
		System.out.println(a%b);
		}catch(Exception x) {
			//x.printStackTrace();
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		new A().m(10, 10);
	}
}
