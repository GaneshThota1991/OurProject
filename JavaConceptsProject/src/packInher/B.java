package packInher;

public class B extends A{

	int b=20;
	public void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		new B().add();
	}
}
