import java.util.*;
import java.lang.*;
import java.io.*;
public class Remove_dup
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int n=s.length();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
				System.out.print(ch[i]);
			}
		}
		if(ch[n-1]!='\0')
		{
			System.out.print(ch[n-1]);
		}
	}
}
