import java.util.*;
import java.lang.*;
import java.io.*;
public class Appear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[][]=new int[n][k];
		int c,count;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<k;i++)
		{
			c=a[n-1][i];
			count=0;
			for(int j=0;j<n;j++)
			{
				for(int m=0;m<k;m++)
				{
					if(c==a[j][m]&&a[j][m]!=-1)
					{
						count++;
						a[j][m]=-1;
						//System.out.println(count+" "+j+" "+m+" "+a[j][m]);
						break;
					}
				}
			}
			if(count==n)
			{
				System.out.print(c+" ");
			}
		}
	}
}
