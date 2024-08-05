package javaprograms;

import java.util.Scanner;

public class MulDivSwap {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
	}

}
