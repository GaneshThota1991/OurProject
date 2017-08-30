package packString;

public class A {
	
	String x;
	String str1="    ";
	String str2="hello java oops";
	String y=new String("Hello");
	public void m() {
		System.out.println(x);
		System.out.println(str1);
		System.out.println(str1.isEmpty());
		System.out.println(str2.substring(6));
		System.out.println(str2.substring(6, 10));
		String[] s=str2.split(" ");
		System.out.println(s.length);
		//for each loop
		/*for(String xx:s) {
			System.out.println(xx);
		}*/
		for(int i=0;i<s.length-1;i++) {
			System.out.println(s[i]);
		}
		System.out.println(y);
	}

	public static void main(String[] args) {
		new A().m();
		
	}
}
