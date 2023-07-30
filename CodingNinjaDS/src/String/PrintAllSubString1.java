package String;

import java.util.Scanner;

public class PrintAllSubString1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		printAllSubString1(str);
		
		
	}

	public static void printAllSubString1(String str) {
		for(int start=0;start<str.length();start++) {
			for(int end=start;end<str.length();end++) {
				System.out.println(str.substring(start,end+1));
			}
		}
	}

}
