package hello;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		summ();
	}
	static void summ() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		int sum=num+num2;
		System.out.print(sum);
	}

}
