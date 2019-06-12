import java.util.*;
import java.lang.*;
import java.io.*;
public class String_comb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n1=s1.length();
		int n2=s2.length();
		int n,a=1,b=10;
		if(n1>n2)
		{
			n=n1;
			char ch1[]=s1.toCharArray();
			char ch2[]=new char[n];
			for(int i=0;i<n2;i++)
			{
				ch2[i]=s2.charAt(i);
			}
			for(int i=n2;i<n;i++)
			{
				ch2[i]=Character.forDigit(a,b);
				a++;
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(ch1[i]+""+ch2[i]);
			}
		}
		else
		{
			n=n2;
			char ch2[]=s2.toCharArray();
			char ch1[]=new char[n];
			for(int i=0;i<n1;i++)
			{
				ch1[i]=s1.charAt(i);
			}
			for(int i=n1;i<n;i++)
			{
				ch1[i]=Character.forDigit(a,b);
				a++;
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(ch1[i]+""+ch2[i]);
			}
		}
		
	}
}
