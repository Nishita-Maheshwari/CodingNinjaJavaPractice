package Recurssion;

public class SumOfProd {

	public static void main(String[] args) {
		System.out.println(prodSum(1234));

	}

	private static int prodSum(int n) {
		if(n%10==n) {
			return n;
			
		}
		return (n%10)*(prodSum(n/10));
		
		
	}

}
