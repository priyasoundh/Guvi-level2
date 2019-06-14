import java.util.*;
import java.lang.*;
import java.io.*;
public class Substr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		int n=s.length();
		char ch[]=s.toCharArray();
		for(int i=0;i<=n-k;i++)
		{
			for(int j=i;j<i+k;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}
