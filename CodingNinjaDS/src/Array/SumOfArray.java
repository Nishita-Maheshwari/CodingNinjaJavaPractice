package Array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		
		int a[]=new int [n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++) {
			s=s+a[i];
			
		}
		System.out.println(s);

	}

}
