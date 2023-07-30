package Array2d;

import java.util.Scanner;

public class FunctionWith2dArray {
	
	
	public static int[][] takeInput(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		
		System.out.println("enter the no of columns");
		int col=sc.nextInt();
		
		int a[][]=new int[rows][col];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter the row "+i+"index enter the column"+j+"index");
				a[i][j]=sc.nextInt();
				
			}
		}
		return a;
		
		
	}
	
	
	
	public static void print2dArray(int [][]a) {
		int rows=a.length;     //rows array of length
		int col=a[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
		}		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int [][]input=takeInput();
		print2dArray(input);
		
	}

}
