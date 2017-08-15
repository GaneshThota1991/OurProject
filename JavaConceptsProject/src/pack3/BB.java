package pack3;

import pack2.*;


public class BB {

	public void m3() {
		AA a=new AA();
		a.m1();
		AA.m2();
		CC c=new CC();
		c.mm();
	}
	public static void main(String[] args) {
		BB b=new BB();
		b.m3();
	}
}
