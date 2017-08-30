package packPoly1;

public class A {
	
	
	//we are overloading add method with three parameters(with different method signature)
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void bikeDesign() {
		System.out.println("50cc parent implementation");
	}
	public void bike1Design() {
		System.out.println("150cc parent implementation");
	}
	public static void main(String[] args) {
		new A().add(11, 22);
		new A().add(11, 22,33);
		
	}

}
