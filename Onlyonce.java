import java.util.*;
import java.lang.*;
import java.io.*;
public class Onlyonce
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j]&&i!=j&&a[i]!=-1)
				{
					count++;
					a[j]=-1;
				}
			}
			if(count==1&&a[i]!=-1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
