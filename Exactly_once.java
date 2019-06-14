import java.util.*;
import java.lang.*;
import java.io.*;
public class Exactly_once
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
		int count;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
