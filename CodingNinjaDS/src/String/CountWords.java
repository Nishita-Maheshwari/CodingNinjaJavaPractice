package String;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(countWord(str));
		

	}

	private static int countWord(String str) {
		if(str.length()==0) {
			return 0;
		}
		
		int space=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				space=space+1;
			}
			
			
			
			
		}
		return space;
		
	}

}
