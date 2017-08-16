package pack6Cond;

public class ForExam {
	
	int a=1, b=10;
	int b1=a++;
	int c=++b1;
	public void m1() {
		
		for(a=1;a<b;a++) {
			System.out.println(a);
		}
		
	}
	public void m2() {
		
		System.out.println(b1);
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		//new ForExam().m1();
		new ForExam().m2();
		
	}
}
