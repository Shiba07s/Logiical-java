package Numbers;

public class Oneto100PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("print 1 to 100 prime numbers list");
		for (int num = 0; num <100; num++) {
			int count=0;
			if (num>1) {
				for (int i = 1; i <=num; i++) {
					if (num%i==0) {
						count++;
					}
				}
				if (count==2) {
					System.out.print(" "+num);

				}
			}
		}
	}

}
