package Array;

public class DuplicateNumber {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,8,7,8,9};
		duplicateNumber(arr);
	

	}

	public static void duplicateNumber(int arr[]) {
		int i;
		for(i=0;i<(arr.length-1);i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
		}
		
			
		//return Integer.MAX_VALUE;
		
		
	}

}
