package pack1;

public class G {
	
	//int[] a=new int[3];//declaration array
	
	int[] a= {11,22,11,33,44};//initialization array
	
	//int[][] b=new int[2][2];//
	int[][] b= {{1,1},{3,4}};
	public void m() {
		try {
		//a[2]=100;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		/*for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}*/
		/*for(int sandeep:a) {
			System.out.println(sandeep);
		}*/
		
		//b[1][0]=100;
		System.out.println(b[1][0]+b[1][1]);
		for(int row=0;row<2;row++) {
			for(int col=0;col<2;col++) {
				System.out.println(b[row][col]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new G().m();
	}

}
