package javaprograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int n=scanner.nextInt();
		int n1=n;
		int temp,t1=0;
		while(n>0)
		{
		temp=n%10;
		t1+=Math.pow(temp,3);
		n=n/10;
		}
		System.out.println(t1);
		if(t1==n1)
		{
			System.out.println("armstrong ");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
