package javaprograms;

import java.util.Scanner;

public class Reverse {
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int num=scanner.nextInt();
		int ld,rev=0;
				while(num>0)
				{
					ld=num%10;
					rev=rev*10+ld;
					num=num/10;
				}
				System.out.println("reverse of num is " +rev);
	}

}
