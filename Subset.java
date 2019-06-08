import java.util.*;
import java.lang.*;
import java.io.*;
public class Subset
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(b[i]==a[j])
				{
					count++;
					a[j]=-1;
					j=n;
				}
			}
		}
		if(count==m)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
