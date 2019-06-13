import java.util.*;
import java.lang.*;
import java.io.*;
public class Rev_string
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		String s1[]=s.split("\\s");
		int p=0;
		for(String w:s1)
		{
			
			char ch[]=w.toCharArray();
			int m=w.length();
			for(int i=m-1;i>=0;i--)
			{
				p++;
				System.out.print(ch[i]);
			}
			if(p<n-1)
			{
				System.out.print(" ");
			}
		}
	}
}
