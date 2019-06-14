import java.util.*;
import java.lang.*;
import java.io.*;
public class Diff_arr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0,sum;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=Math.abs(a[i]-a[j]);
				if(sum==k)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
