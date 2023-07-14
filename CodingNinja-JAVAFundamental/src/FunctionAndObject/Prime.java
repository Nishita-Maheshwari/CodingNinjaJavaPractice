package FunctionAndObject;

import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean ansPrime=isPrime(13);
		System.out.println(ansPrime);
	}

}
