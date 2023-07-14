package Loops;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				s=s+i;
			}

	}
	System.out.println(s);
	}
}
