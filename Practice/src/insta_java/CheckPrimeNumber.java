package insta_java;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int prime=0;

		if (num>1) {
			for (int i = 2; i <= num; i++) {
				if (num%i==0) {
					prime++;
				}
			}
			if (prime==2) {
				System.out.println("yes : "+num);
			} else {
				System.out.println("No : "+num);

			}
		}
		

	}

}
