package packArray;

public class A {
	
	//single dimension array
	
//	int[] x=new int[3];
	int[] x= {1,2,3,24,22424,7788};//array initialization
	String[] s=new String[5];
	
	//multi dimension array
	//int[][] y=new int[2][2];//declaration
	
	int[][] y= {{11,22},{33,44}};
	public void m() {
		for(int i:x) {
			System.out.println(i);
		}
		
		for(String ss:s) {
			System.out.println(ss);
		}
		System.out.println();
		for(int row=0;row<2;row++) {
			for(int col=0;col<2;col++) {
				System.out.println(y[row][col]);
			}
		}
		System.out.println();
		System.out.println(y[1][1]);
	}
	
	public static void main(String[] args) {
		new A().m();
	}

}
