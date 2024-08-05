package javaprograms;

import java.util.Scanner;

public class FloatBinary{
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the binary num");
	String binnumString=scanner.next();
	
String[] st=binnumString.split("\\.",5);
 String part1 = st[0]; 
 String part2 = st[1];
 int p1=Integer.parseInt(part1);
 int p2=Integer.parseInt(part2);
    
   	
int rem=0,sum=0;
float res=0,sum1=0;
int p=0,rev=0;
while(p1>0)
{ 
   
	rem=p1%10;
	sum+=rem*Math.pow(2, p);
	p1=p1/10;
	p++;
}

	
	while(p2>0) {
		
		rem=p2%10;
		rev=rev*10+rem;
		p2=p2/10;
	}

	p=-1;
	while(rev>0)
	{ 
	   
		rem=rev%10;
		sum1+=rem*Math.pow(2, p);
		rev=rev/10;
		p--;
	}
		System.out.println(sum+sum1);
	
	
	
	
	
	
	
	
	
	
	 scanner.close();
			}

}
