import java.util.*;
import java.lang.*;
import java.io.*;
public class Currency
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			if(n>=1000)
			{
				n=n-1000;
				count++;
			}
			else if(n>=500)
			{
				n=n-500;
				count++;
			}
			else if(n>=100)
			{
				n=n-100;
				count++;
			}
			else if(n>=50)
			{
				n=n-50;
				count++;
			}
			else if(n>=10)
			{
				n=n-10;
				count++;
			}
			else if(n>=1)
			{
				n=n-1;
				count++;
			}
		}
		System.out.println(count);
	}
}
