package Recurssion;

public class PalindromeNum {
	public static void main(String[] args) {
		System.out.println(palindrome(121));
	}

	private static boolean palindrome(int n) {
	
		return (n==rev2(n));
	}

	private static int rev2(int n) {
		//sometimes you might need some additional variables in the argumentin that case,
		//make another function
		
		int digits=(int)(Math.log10(n)+1);
		return helper(n,digits);
		
		
	}

	private static int helper(int n, int digits) {
		if(n%10==n) {
		return n;
	}
		int rem=n%10;
		return (int) (rem*Math.pow(10,digits-1)+helper(n/10, digits-1));
	}
	

}

