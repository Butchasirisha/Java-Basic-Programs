package strings;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int vcount=0,ccount=0;
		System.out.println("enter the string");
		String r1=scanner.nextLine();
		for(int i=0;i<r1.length();i++)
		{
			if(r1.charAt(i)=='a' || r1.charAt(i)=='e' || r1.charAt(i)=='i' || r1.charAt(i)=='o' || r1.charAt(i)=='u')
			{
				vcount++;
			}
			else {
				if(r1.charAt(i)>='a' && r1.charAt(i)<='z'){
					ccount++;
			}
			
			}
		}
		System.out.println("vowel count is"+vcount);
		System.out.println("consonant count is"+ccount);
	}

}
