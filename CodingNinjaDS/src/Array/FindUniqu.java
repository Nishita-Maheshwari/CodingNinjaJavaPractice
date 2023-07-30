package Array;

public class FindUniqu {

	public static void main(String[] args) {
		int a[]= {2,3,3,4,2,6,4,6,7,7,8,8};
		System.out.println(findUnique(a));
		

	}

	private static int findUnique(int[] a) {
		int unique=0;
		for(int n:a) {
			unique ^=n;
			
		}
		return unique;
		
	}

}
