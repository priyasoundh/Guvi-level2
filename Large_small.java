import java.util.*;
import java.lang.*;
import java.io.*;

public class Large_small
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
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]<a[j]&&i%2==0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(a[i]>a[j]&&i%2!=0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
	}
}
