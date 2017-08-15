package pack1;

public class F {
	 E e=new E();
	public void m3() {
	
		e.m1();
		E.m2();
	}
	public void m4() {
		
		e.m1();
	}
	public static void m5() {
		E e1=new E();
		e1.m1();
		E.m2();
	}
}
