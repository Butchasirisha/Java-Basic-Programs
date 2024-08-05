package javaprograms;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter a binary number");
int n=scanner.nextInt();

int x=0;
int rem=0,sum=0;
while(n>0)
{
	 rem=n%10;
	sum+=rem*Math.pow(2, x);
	n=n/10;
	x++;
}
System.out.println(sum);	

	}
}
