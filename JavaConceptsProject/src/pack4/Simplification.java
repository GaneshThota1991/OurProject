package pack4;

//for rename alt+shift+r

public class Simplification {
	
	int a=10,b=20;//global or instance or concrete or non static
	static int xx=9999;
	static int c=2000;//static varibale or class variable
	//can we define static variable inside the method
	//ans: no
	
	//private  int i=111;
	
	 void add() {
		
		int a=10,b=200;
		//static int ii=99999;
		System.out.println(a+b);
	}
	public static void mmm() {
		 
		 System.out.println(xx);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Simplification a=new Simplification();
		a.add();
		new Simplification().sub();
	}

}
