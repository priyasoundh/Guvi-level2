import java.util.*;
import java.lang.*;
import java.io.*;
public class Sub_stringh
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		int n=s.length();
		int n1=s1.length();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		int count=0,a=0;
		for(int i=0;i<n;i++)
		{
			if(a<n1)
			{
				if(ch[i]==ch1[a])
				{
					a++;
				}
				else if(a>0)
				{
					i=i-1;
					a=0;
				}
			}
		}
		if(a==n1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
