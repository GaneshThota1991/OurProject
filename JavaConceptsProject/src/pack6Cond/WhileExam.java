package pack6Cond;

public class WhileExam {

	
	int a=90;
	public void m() {
		/*while(a>10) {
			System.out.println("hello");
		}*/
		
		do {
			System.out.println("Hello");
		}while(a>10);
	}
	
	public static void main(String[] args) {
		new WhileExam().m();
	}
}
