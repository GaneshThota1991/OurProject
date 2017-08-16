package pack6Cond;

public class SwitchExam {

	public void mm() {
		System.out.println("hello");
	}
	
	public void m(int a) {

		switch (a) {
		case 1:
			//System.out.println("first");
			mm();
			break;
		case 2:
			System.out.println("second");
			break;
		case 3:
			System.out.println("third");
			break;
		default:
			System.out.println("unknow");
			break;
		}
	}
	public static void main(String[] args) {
		new SwitchExam().m(1);
	}

}
