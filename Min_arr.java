import java.util.*;
import java.lang.*;
import java.io.*;
public class Min_arr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		System.out.print(a[0]);
		for(int i=1;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			System.out.print(" "+min);
		}
	}
}
