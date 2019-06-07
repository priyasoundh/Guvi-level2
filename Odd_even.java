import java.util.*;
import java.lang.*;
import java.io.*;
public class Odd_even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count,b=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0&&i%2==0)
			{
				System.out.print(a[i]+" ");
			}
			else if(a[i]%2==0&&i%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
