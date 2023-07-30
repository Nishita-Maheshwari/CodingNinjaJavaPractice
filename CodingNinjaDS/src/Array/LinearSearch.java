package Array;

import java.util.Scanner;

public class LinearSearch {
	
	private static int linearSearch(int[] arr,int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the element "+ i+"index");
			arr[i]=sc.nextInt();
		}
		
	   return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr=takeInput();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the check value");
		int val=sc.nextInt();
		
		System.out.println(linearSearch(arr,val));
	}



}
