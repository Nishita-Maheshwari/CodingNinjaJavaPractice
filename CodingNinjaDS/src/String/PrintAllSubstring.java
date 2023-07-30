package String;

import java.util.Scanner;

public class PrintAllSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		subString(str);
	
	}
	
	public static void subString(String str) {
		int n=str.length();
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				
				for(int k=i;k<=j;++k) {
					System.out.println(str.charAt(k));
					
				}
				System.out.println();
			}
		}
		
	}

}
