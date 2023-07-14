package Loops;

import java.util.Scanner;

public class LargsestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>=b && b>=c) {
			System.out.println("A is largest");
		}
		else if(b>=c && b>=c){
			System.out.println("Bis largest");
		}
		else {
			System.out.println("C is largest");
		}
	}

}
