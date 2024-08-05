package javaprograms;

import java.util.Scanner;

public class PosorNegNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the range");
		int n=scanner.nextInt();
		if(n==0)
		{
			System.out.println("neither positive nor negative");
		}
		else if(n>0)
		{
			System.out.println("positive number");
		}
		else {
			System.out.println("negative num");
		}

	}

}
