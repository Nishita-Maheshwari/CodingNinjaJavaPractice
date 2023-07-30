package Array;

public class LargestSmallestElement {

	public static void main(String[] args) {
		int a[]= {2,3,4,6,8};
		int temp, size=a.length;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Smallest Element" + a[0]);
		System.out.println("Second Smallest Element" + a[1]);
		
		
		System.out.println("Largest Element" + a[size-1]);
		System.out.println("Second Largest Element" + a[size-2]);
		

	}

}
