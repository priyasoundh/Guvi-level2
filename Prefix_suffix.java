import java.util.*;
import java.lang.*;
import java.io.*;
public class Prefix_suffix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,x,y;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			x=0;
			y=0;
			for(int j=0;j<i;j++)
			{
				x=x+a[j];
			}
			for(int j=i+1;j<n;j++)
			{
				y=y+a[j];
			}
			if(x==y)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
