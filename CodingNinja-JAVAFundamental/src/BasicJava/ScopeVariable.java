package BasicJava;

public class ScopeVariable {

	public static void main(String[] args) {
		int i=2;
		System.out.println(i);
		if(i==2) {
			int n=2;
			System.out.println(n);
		}

	}

}
