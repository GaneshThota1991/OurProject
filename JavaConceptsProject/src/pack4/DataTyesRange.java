package pack4;

public class DataTyesRange {
	
	byte bMax=Byte.MAX_VALUE;
	byte bMin=Byte.MIN_VALUE;
	byte b=-128;
	short sMax=Short.MAX_VALUE;
	short sMin=Short.MIN_VALUE; 
	String str="Hello how are you.....87879898%%$%%";
	String firstName="Hi";//initialization
	String lastName="Java";
	String s;//declaration
	
	

	//class and project name's should start with capital letter
	//package,method and variable name's should start with small letter(should maintain camel notation)
	public void dataTypesRange() {
		System.out.println(bMax);
		System.out.println(bMin);
		System.out.println(sMax);
		System.out.println(sMin);
		System.out.println(str);
		System.out.println(firstName+"\n"+lastName);
		System.out.println(s);
		
		
	}
	public static void main(String[] args) {

		DataTyesRange  d=new DataTyesRange();
		d.dataTypesRange();
		
	}

}
