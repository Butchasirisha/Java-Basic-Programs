package javaprograms;

import java.util.Scanner;


public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String str=scanner.next();
		int len=str.length();
		int i=0; 
		int j=len-1;
			while(i<j) {
				
			if(str.charAt(i)!=str.charAt(j))
			{
				
				System.out.println("not");
				System.exit(0);
			}
			i++;
			j--;
			}
			System.out.println("palindrome");
				}
			
			
			
			
			}
			
		
	

	
