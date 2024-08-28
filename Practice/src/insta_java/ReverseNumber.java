package insta_java;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234;
		int originalnumber=num;
		
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println("original number : "+originalnumber);
		System.out.println("rev number : "+rev);

	}

}
