package insta_java;

public class CheckEvenOdd {
	public static void main(String[] args) {
		int num=10;
		
		checkEvenodd(num);
	}
	public static void checkEvenodd(int num) {
		if (num%2==0) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

}
