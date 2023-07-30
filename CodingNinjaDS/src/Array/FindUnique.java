package Array;

public class FindUnique {
	public static void main(String[] args) {
		int []a= {1,2,34,4,5,6};
		//System.out.println(findUnique(a));
	}

	private static int findUnique(int []a) {
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=0;j<a.length;i++) {
				if(i!=j) {
					if(a[i]==a[j]) {
						break;
					}
				}
			}
			
			
			return a[i];
			}
		return Integer.MAX_VALUE;
		}
		
	
	}


