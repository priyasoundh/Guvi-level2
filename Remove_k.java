import java.util.*;
import java.lang.*;
import java.io.*;
public class Remove_k
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==k)
			{
				count++;
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		if(count==n)
		{
			System.out.println("empty");
		}
	}
}
