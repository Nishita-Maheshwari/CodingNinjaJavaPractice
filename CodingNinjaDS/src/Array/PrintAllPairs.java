package Array;

public class PrintAllPairs {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		printAllPairs(arr);

	}

	private static void printAllPairs(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.println("("+ arr[i]+","+arr[j]+")");
			}
		}
		
	}

}
