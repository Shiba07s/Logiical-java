package Numbers;

public class SwapNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("before the swap value of a: "+ a + " and b:  "+ b);
//		logic-1 :using 3rd variable
		int c=a;
		a=b;
		b=c;
		
		//without 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After the swap value of a: "+ a + " and b:  "+ b);

	}

}
