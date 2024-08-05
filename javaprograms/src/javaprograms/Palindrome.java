package javaprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int num=scanner.nextInt();
		int onum=num;
		int ld,rev=0;
				while(num>0)
				{
					ld=num%10;
					rev=rev*10+ld;
					num=num/10;

				}
				if(rev==onum)
				{
					System.out.println("palindrome");
				}
				else {
					System.out.println("not palindrome");
				}
	}
	}


