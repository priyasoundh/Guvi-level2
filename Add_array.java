import java.util.*;
import java.lang.*;
import java.io.*;
public class Add_array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		int i=0,sum=0;
		while(n>0)
		{
			a[i]=n%10;
			n=n/10;
			i++;
		}
		n=i;
		for(i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
			}
		}
		System.out.println(sum);
	}
}
