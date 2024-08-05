package strings;

import java.util.Scanner;

public class PunctuationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int count=0;
		System.out.println("enter the string");
		String r1=scanner.nextLine();
		for(int i=0;i<r1.length();i++)
		{
			if(r1.charAt(i)=='!' || r1.charAt(i)=='.' || r1.charAt(i)=='?' || r1.charAt(i)==':' || r1.charAt(i)==';' || r1.charAt(i)==',')
			{
				count++;
			}
		}
		System.out.println("string count is"+count);
	}

}
