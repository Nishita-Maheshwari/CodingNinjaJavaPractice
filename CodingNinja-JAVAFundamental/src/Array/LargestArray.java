package Array;

import java.util.Scanner;

public class LargestArray {
	
	public static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr=takeInput();
		int l=largest(arr);
		System.out.println(l);
		

	}

	private static int largest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
