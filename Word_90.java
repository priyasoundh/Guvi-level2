import java.util.*;
import java.lang.*;
import java.io.*;
public class Word_90
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int n1=s1.length();
		int n2=s2.length();
		int n=n1;
		if(n2>n1)
		{
			n=n2;
		}
		for(int i=0;i<n;i++)
		{
			if(i<n2)
			{
				System.out.print(ch2[i]);
			}
			if(i<n1)
			{
				System.out.print(ch1[i]);
			}
			System.out.println();
		}
	}
}
