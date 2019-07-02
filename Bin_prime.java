import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Bin_prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int pd=0;
		for(int i=a;i<=b;i++)
		{
			int c=0,count=0,d=i,e;
			while(d>0)
			{
				e=d%2;
				d=d/2;
				c=c+e;
			}
			for(int j=2;j<=c*c;j++)
			{
				if(c%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				pd++;
			}
		}
		System.out.println(pd);
	}
}
