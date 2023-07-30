package String;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverseWord(str));

	}

	private static String reverseWord(String str) {
		String str1="";
		int currentWordStart=0;
		int i=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				//Reverse CurrentWord
				int currentEndWord=i-1;
				String reverseWord="";
				
				for(int j=currentWordStart;j<currentEndWord;j++) {
					reverseWord=str.charAt(j)+reverseWord;
					
				}
				str1 += reverseWord+"";
				currentWordStart= i+1;
				
			}
		}
		int currentEndWord=i-1;
		String reverseWord="";
		
		for(int j=currentWordStart;j<currentEndWord;j++) {
			reverseWord=str.charAt(j)+reverseWord;
			
		}
		str1 += reverseWord;
		//currentWordStart= i+1;
		return str1;
		
	}

}
