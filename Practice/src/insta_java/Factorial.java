package insta_java;

public class Factorial {
	public static void main(String[] args) {
		
		int num=5;
		int factorialnumber=1;
		
		for (int i = num; i >=1; i--) {
			factorialnumber=factorialnumber*i;
		}
		System.out.println(factorialnumber);
		
//		while (num>0) {
//			factorialnumber=factorialnumber*num;
//			num--;
//		}
//		System.out.println(factorialnumber);
	}

}
