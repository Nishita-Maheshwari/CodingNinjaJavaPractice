package Array;

public class BasicOfArray {

	public static void main(String[] args) {
		int arr[]=new int[10];
		arr[0]=10;
		arr[5]=3;
		System.out.println(arr[0]);
		System.out.println(arr[3]); //0
		System.out.println(arr[4]);
		
		//by default  int array value is 0
		char c[]=new char[10];
		double d[]=new double[10];
		
		System.out.println(c[1]); //null (by default
		System.out.println(d[2]); //0.0 double value
		
		//array size 0 to n-1
		
		boolean b[]= new boolean[10];
		System.out.println(b[0]);//false

	}

}
