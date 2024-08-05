package javaprograms;

import java.util.Scanner;

public class NextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter thh number");
int n=scanner.nextInt();
for(int i=n+1;i<100;i++)
	{
	int count=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			count=count+1;
		
		}
		
}
	if(count==2)
	{
		System.out.println("the next prime is " +i);
		break;
	}
	else {
		n++;
	}
	}
	}

}
