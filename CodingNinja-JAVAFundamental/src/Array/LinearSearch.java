package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=sc.nextInt();
		
		int a[] =new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("eneter element"+i+"index");
			a[i]=sc.nextInt();
		}
		
		System.out.println(linearSearch(a, val));

	}

	private static int  linearSearch(int a[],int val) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==val) {
				return i;
			}
		}
		
		return -1;
	}

}
