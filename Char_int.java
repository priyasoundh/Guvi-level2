import java.util.*;
import java.lang.*;
import java.io.*;
public class Char_int
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int a=ch[i];
			sum=sum+a;
		}
		System.out.println(sum);
	}
}
