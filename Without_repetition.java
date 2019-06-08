import java.util.*;
import java.lang.*;
import java.io.*;
public class Without_repetition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		char ch[]=s.toCharArray();
		int count,a;
		for(int i=0;i<n-1;i++)
		{
			count=1;
			a=0;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j]&&ch[j]!='\0')
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count>1)
			{
				ch[i]='\0';
			}
		}
		for(int i=0;i<n;i++)
		{
			if(ch[i]!='\0')
			{
				System.out.print(ch[i]);
			}
		}
	}
}
