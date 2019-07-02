import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Island
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int count=0;
		if(n==1)
		{
			if(a[0][0]==1)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i][j]==1)
					{
						
						if(i==0)
						{
							if(j==0)
							{
								if(a[i+1][j]==0&&a[i][j+1]==0&&a[i+1][j+1]==0)
								{
									count++;
									//System.out.println("1 "+i+" "+j);
								}
							}
							else if(j==n-1)
							{
								if(a[i+1][j]==0&&a[i][j-1]==0&&a[i-1][j-1]==0)
								{
									count++;
									//System.out.println("2 "+i+" "+j);
								}
							}
							else
							{
								if(a[i+1][j]==0&&a[i][j+1]==0&&a[i][j-1]==0&&a[i+1][j+1]==0&&a[i+1][j-1]==0)
								{
									count++;
									//System.out.println("3 "+i+" "+j);
								}
							}
						}
						else if(j==0)
						{
							if(i==n-1)
							{
								if(a[i-1][j]==0&&a[i][j+1]==0&&a[i-1][j+1]==0)
								{
									count++;
									//System.out.println("4 "+i+" "+j);
								}
							}
							else
							{
								if(a[i+1][j]==0&&a[i][j+1]==0&&a[i-1][j]==0&&a[i+1][j+1]==0&&a[i-1][j+1]==0)
								{
									count++;
									//System.out.println("5 "+i+" "+j);
								}
							}
						}
						
						else if(i==n-1)
						{
							if(j==n-1)
							{
								if(a[i-1][j]==0&&a[i][j-1]==0&&a[i-1][j-1]==0)
								{
									count++;
									//System.out.println("6 "+i+" "+j);
								}
							}
							else
							{
								if(a[i-1][j]==0&&a[i][j+1]==0&&a[i][j-1]==0&&a[i-1][j-1]==0&&a[i-1][j+1]==0)
								{
									count++;
									//System.out.println("7 "+i+" "+j);
								}
							}
						}
						
						else if(j==n-1)
						{
							if(a[i-1][j]==0&&a[i][j-1]==0&&a[i-1][j-1]==0&&a[i+1][j-1]==0)
							{
								count++;
								//System.out.println("8 "+i+" "+j);
							}
							
						}
						
						else
						{
							if(a[i+1][j]==0&&a[i][j+1]==0&&a[i-1][j]==0&&a[i][j-1]==0&&a[i+1][j+1]==0&&a[i+1][j-1]==0&&a[i-1][j+1]==0&&a[i-1][j-1]==0)
								{
									count++;
									//System.out.println("9 "+i+" "+j);
								}
						}
						
					}
				}
			}
			System.out.println(count);
		}
	}
}
