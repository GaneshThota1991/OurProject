package pack6Cond;

public class IfExam {

	int a=100,b=20;
	public void m1() {
		if(a>b) {
			System.out.println("a is big");
		}
	}
	
	public void m2(int a, int b) {
		if(a>b) {
			System.out.println("a is big");
		}
		else if(a==b) {
			System.out.println("a and b values are equals..");
		}
		else if(a!=b) {
			System.out.println("a and b values are not equals...");
		}
		/*else {
			System.out.println("b is big");
		}*/
	}
	
	public static void main(String[] args) {
	//	new IfExam().m1();
		new IfExam().m2(11, 110);
	}
}
