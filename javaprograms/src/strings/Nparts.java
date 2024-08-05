package strings;

import java.util.Scanner;

public class Nparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scanner.nextLine();
		System.out.println("ENTER no of parts");
		int n=scanner.nextInt();
		int l=s.length()/n;
		String[] f=new String[n];
		int temp=0;
		if(s.length()%n!=0)
		{
			System.out.println("string cannot be divided into equal parts");
		}
		else {
			
		
		for(int i=0;i<s.length();i+=l)
		
		{
			f[temp]=s.substring(i,i+l);
			temp++;
	
		}
		}
		for(int i=0;i<f.length;i++)
			
		{
			System.out.println(f[i]);
		}
	
	}
}
