package Array;

public class PairSumSolution {

	public static void main(String[] args) {
		int x=7;
		int[]a= {1,2,4,7,0,3};
		
		pairSum(a,x);

	}

	private static void pairSum(int[] a, int x) {
		int numOfPairs=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==x) {
					numOfPairs+=1;
				}
				
			}
			
		}
		System.out.println(numOfPairs);
		
	}
}
