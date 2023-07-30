package Recurssion;

public class Concept {
	public static void main(String[] args) {
		fun(5);
	}

	private static void fun(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		fun(n--);  //first assign then decrease that's why it's giving error
		
		
	}

}
