package BasicJava;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		int k=i+j;
		System.out.println(k);
		
		
		double d=sc.nextDouble();
		long l=sc.nextLong();
		float f=sc.nextFloat();

	}

}
