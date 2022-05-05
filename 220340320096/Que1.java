class Que1{
	
	
	static void insertionSort(int[] a){
		
		int n = a.length;
		int temp = a[n-1];
		for(int i=n-2;i>=0;i--){
			
			if(a[i]>temp){
			a[i+1] =a[i];
			display(a);
			}
			
			else{
				
				a[i+1] = temp;
				display(a);
			}
			// int j=i-1;
			
			// while(j>=0 && a[j]<temp){
				
			// a[j+1]=a[j];
			// j--;
			// display(a);
			// }
			// a[j+1]=temp;
		}
		
	}
	
	static void display(int a[]){
		
		for(int i = 0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
		
	
	public static void main(String[] args){
		
		int[] a1 ={2,4,6,8,3};
		int n = a1.length;
		insertionSort(a1);
		
	}
}

