package String;

import java.util.Scanner;

public class ReverseLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();		
		System.out.println(reverseString(s));
	}

	private static String reverseString(String s) {
		String st="";
		for(int i=s.length()-1;i>=0;i--) {
			st=st+s.charAt(i);
		}
		return st;
		
		
	}

}
