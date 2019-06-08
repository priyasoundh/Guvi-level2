import java.util.*;
import java.lang.*;
import java.io.*;
public class Prime_sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=3,sum=0,count;
		while(a<=n)
		{
			count=0;
			for(int i=1;i*i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				sum+=a;
			}
			a=a+10;
		}
		System.out.println(sum);
	}
}
