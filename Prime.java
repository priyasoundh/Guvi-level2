import java.util.*;
import java.lang.*;
import java.io.*;
public class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<2)
		{
			System.out.println("0");
		}
		if(n>=2)
		{
			System.out.print("2 ");
		}
		for(int i=3;i<n;i+=2)
		{
			int count=0;
			for(int j=1;j*j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
