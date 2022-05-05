class Que3{
	
	static int[] arr = new int[10];
	static int n = arr.length;
	static int tos1 = n/2;
	static int tos2 = n/2;
	
	
	static void push1(int d){
		
		if(tos1>0){
			tos1--;
			arr[tos1] = d;
		}
		else
			System.out.println("Stack Overflow");
		
	}
	
	static void push2(int d){
		
		if(tos2<n){
			
			tos2++;
			arr[tos2] = d;
		}
		else
			System.out.println("Stack Overflow");
		
	}
	
	static void pop1(){
		
		if(tos1<=n/2){
		int x = arr[tos1];
		tos1++;
		System.out.println("Popped element from stack1 is "+x);
		}
		else
			System.out.println("Stack Underflow");
	}
	
	static void pop2(){
		
		if(tos2>=n/2){
		int x = arr[tos2];
		tos1--;
		System.out.println("Popped element from stack2 is "+x);
		}
		else
			System.out.println("Stack Underflow");
	}
	
	public static void main(String[] args){
		
		push1(5);
		push2(10);
		push2(15);
		push1(11);
		push2(7);
		push2(40);
		pop1();
		pop2();
	}
}