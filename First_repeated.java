import java.util.*;
import java.lang.*;
import java.io.*;
public class First_repeated
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
		for(int i=1;i<n;i++)
		{
			count=1;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j]&&i!=j&&a[i]!=-1)
				{
					count++;
					a[j]=-1;
				}
			}
			if(count==2&&a[i]!=-1)
			{
				System.out.println(a[i]);
				i=n;
				b++;
			}
		}
		if(b==0)
		{
			System.out.println("unique");
		}
	}
}
