package Array;

import java.util.Scanner;

public class ArrangingOddEven {

	public static void main(String[] args) {
		takeInput();

	}

	private static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;


		
	}

}
