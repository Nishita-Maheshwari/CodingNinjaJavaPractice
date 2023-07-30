package Array;

public class NonPrimitive {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		printArray(arr);
		incrementArray(arr);

	}

	private static void incrementArray(int[] input) {
		input=new int[7];
		for(int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		}
		
	}

	private static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
