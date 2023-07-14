package FunctionAndObject;

public class PrintNnum {
	
	public static int Num(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i);
		}
		return n;
		
	}
	
	public static void main(String[] args) {
		int a=Num(12);
		
		System.out.println(a);
		
		
	}

}
