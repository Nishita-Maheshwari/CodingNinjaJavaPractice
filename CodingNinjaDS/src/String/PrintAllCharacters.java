package String;

import java.util.Scanner;

public class PrintAllCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		String str= sc.nextLine();
		
		printCharacter(str);

	}

	private static void printCharacter(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	
		
	}

}
