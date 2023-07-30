package Array;

import java.util.Scanner;

public class LinearSearch2 {
	
	
	public static int linearSearch(int val,int n,int []takeInput1) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("enter the element "+i+"index");
			takeInput1[i]=sc.nextInt();
		}
		for(int i=0;i<takeInput1.length;i++) {
			if(takeInput1[i]==val) {
				return i;
			
			
		}

		
			
		}
		
		return -1;
	
		
		
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int val=sc.nextInt();
		int takeInput1[]=new int[n];
		
		System.out.println(linearSearch(val,n,takeInput1));

	}

}
