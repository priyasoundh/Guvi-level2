import java.util.*;
import java.lang.*;
import java.io.*;
public class Exp
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
		for(int i=0;i<n;i++)
		{
			int b=a[i]/100;
			int c=b%10;
			int d=a[i]/10;
			int e=d%1000;
			if(a[i]==1||a[i]==4||a[i]==78)
			{
				System.out.println("+");
			}
			else if(a[i]%100==35)
			{
				System.out.println("-");
			}
			else if(a[i]%10==4)
			{
				System.out.println("*");
			}
			else
			{
				System.out.println("?");
			}
		}
	}
}
