package packPoly1;

public class B extends A {

	public void add(int a, int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	
	public void bikeDesign() {    // Method over-riding.
		System.out.println("100 cc child implementation");
	}
	public static void main(String[] args) {
		new B().add(11, 22,33,44);
		new B().bikeDesign();
		new A().bikeDesign();
		new A().bike1Design();
	}
}
