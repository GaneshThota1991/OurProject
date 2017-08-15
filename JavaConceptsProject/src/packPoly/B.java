package packPoly;

public class B extends A {
	public void add(int a, int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	
	public void bikeEngineDesign() {
		System.out.println("100 cc bike");
	}
	
	public static void main(String[] args) {
		B bb=new B();
		bb.add(11, 22, 33, 44);
		bb.bikeEngineDesign();
		new A().bikeEngineDesign();
				
	}
}
