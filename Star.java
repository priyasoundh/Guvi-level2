import java.util.*;
import java.lang.*;
import java.io.*;
public class Star
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println(a[n-1]);
		for(int j=0;j<n;j++)
		{
			if(a[0]<a[j])
			{
				temp=a[0];
				a[0]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[0]);
	}
}
