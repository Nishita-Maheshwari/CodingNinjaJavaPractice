package Array;

public class SecondMaxElement {

	public static void main(String[] args) {
		int arr[]= {1,4,2,3,5,6};
		int temp,size=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<size;j++) {
			
			
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}		
			
		}
		System.out.println(arr[size-2]);
		
		}
	}

