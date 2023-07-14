package Array;

import java.util.Scanner;

public class InputOfArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int a[] =new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("eneter element"+i+"index");
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}

	}

}
