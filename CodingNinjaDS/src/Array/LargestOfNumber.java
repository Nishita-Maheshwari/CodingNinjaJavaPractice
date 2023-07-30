package Array;

import java.util.Scanner;

public class LargestOfNumber {
	
	public static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element"+ i+"index");
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	
	
	
	 
	
	
	public static void main(String[] args) {
		int []arr=takeInput();
		int lr=largest(arr);
		
		System.out.println(lr);
		
	}






	private static int largest(int[] arr) {
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
