import java.util.*;
import java.lang.*;
import java.io.*;
public class Right_max
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,temp,max;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n-1;i++)
		{
			max=a[i];
			for(int j=i+1;j<n;j++)
			{
				if(max<a[j])
				{
					max=a[j];
				}
			}
			System.out.print(max+" ");
		}
		System.out.println(a[n-1]+" 0");
	}
}
