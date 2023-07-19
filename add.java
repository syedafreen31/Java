package hello;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		int num=3552,reversednum=0,remainder;
		int originalnum=num;
		while(num!=0) {
			remainder=num%10;
			reversednum=reversednum*10+remainder;
			num/=10;
		}
		if(originalnum==reversednum) {
			System.out.print(originalnum+ " is palindrome");
		}else {
			System.out.print(originalnum+ " is not a palindrome");
		}
	
	
	}

}
