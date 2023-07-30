package Array;

public class nextZero {

	public static void main(String[] args) {
		int []a= {1,1,0,0,1,1,0};
		System.out.println(sortZeroAndOne(a));

	}

	private static int sortZeroAndOne(int[] a) {
		int nextZero=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp=a[nextZero];
				a[nextZero]=a[i];
				a[i]=temp;
				
				nextZero+=1;
			}
			//System.out.println(a[i]);
		}
		return nextZero;
		
		
		
	}

}
