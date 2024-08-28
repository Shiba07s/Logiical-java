package insta_java;

public class LeapYear {
	public static void main(String[] args) {
		int num=2017;
		
		boolean isLeapYear=false;
		
		if (num%4==0) {
			if (num%100!=0 || num%400==0) {
				isLeapYear=true;
			}
		}
		if (isLeapYear) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
	

}
