package strings;


import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the string1");
		String r1=scanner.nextLine();
		System.out.println("enter the string2");
		String r2=scanner.nextLine();
		r1.toLowerCase();
		r2.toLowerCase();
		if(r1.length()!=r2.length())
		{
			System.out.println("NotAnagrams");
		}
		else {
		char[] c1=r1.toCharArray();
		char[] c2=r2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);System.out.println(c2);
	if(Arrays.equals(c1,c2)==true)
	{
		System.out.println("anagrams");
	}
	else {
		
		System.out.println("not anagrams");
	}
		}
	
	}

}
