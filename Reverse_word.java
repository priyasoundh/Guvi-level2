import java.util.*;
import java.lang.*;
import java.io.*;
public class Reverse_word
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split("\\s");
		for(String w:s1)
		{
			char ch[]=w.toCharArray();
			int n=w.length();
			for(int i=n-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
	}
}
