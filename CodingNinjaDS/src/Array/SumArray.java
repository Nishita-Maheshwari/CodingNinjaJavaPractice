package Array;

public class SumArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4};
		findDuplicate(arr);
	}

	private static void findDuplicate(int[] arr) {
		int s=0;
		for(int i=0;i<arr.length;i++) {
			s=s+arr[i];
		}
		System.out.println(s);
		
	}
	
	

}
