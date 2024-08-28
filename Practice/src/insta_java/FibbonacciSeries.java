package insta_java;

public class FibbonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1;
		int num=10;
		System.out.print(a+" "+b);
		
		for (int i = 2; i <num; i++) {
			int next=a+b;
			System.out.print(" "+next);
			a=b;
			b=next;
		}
	}

}
