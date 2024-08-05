package javaprograms;

import java.util.Scanner;

public class MultiplicationRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a  number");
		int n=scanner.nextInt();
		System.out.println("enter the range");
		int r=scanner.nextInt();
for(int i=1;i<=r;i++)
{
	int m=n*i;
	System.out.println(n +"x"+ i + "=" + m);
}
	}

}
