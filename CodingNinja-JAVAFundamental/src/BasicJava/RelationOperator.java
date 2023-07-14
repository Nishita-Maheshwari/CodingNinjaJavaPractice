package BasicJava;

import java.util.Scanner;

public class RelationOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		boolean isEq=(i==j);
		boolean neq  = (i!=j);
		boolean isgr=(i>=j);
		boolean isless=(i<=j);
		
		System.out.println("Is Equal" + isEq);
		System.out.println("Is Not Equal" + neq);
		System.out.println("Is greater than" + isgr);
		System.out.println("Is less than "+ isless);
		

	}

}
