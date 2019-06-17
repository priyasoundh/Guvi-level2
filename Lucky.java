import java.util.*;
import java.lang.*;
import java.io.*;
public class Lucky
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%n==0&&a[i]<=n*n)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
