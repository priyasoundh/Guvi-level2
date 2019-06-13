import java.util.*;
import java.lang.*;
import java.io.*;
public class Suffled
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(ch[0]==ch[i])
			{
				count++;
			}
		}
		if(count==n)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
