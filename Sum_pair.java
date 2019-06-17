import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_pair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum,b=100,c=0,d=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((a[i]+a[j])==a[k])
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}
