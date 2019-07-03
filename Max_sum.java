import java.util.*;
import java.lang.*;
import java.io.*;
public class Max_sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=-100000,b=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b=0;
			for(int j=i;j<n;j++)
			{
				b=b+a[j];
				if(count<b)
				{
					count=b;
				}
			}
		}
		System.out.println(count);
	}
}
