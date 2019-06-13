import java.util.*;
import java.lang.*;
import java.io.*;
public class Next_power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		int i=0;
		double sum=0;
		while(n>0)
		{
			a[i]=n%10;
			n=n/10;
			i++;
		}
		n=i;
		for(i=0;i<n-1;i++)
		{
			sum=sum+Math.pow(a[i+1],a[i]);
			//System.out.println(a[i+1]+" "+a[i]);
		}
		sum=sum+Math.pow(a[0],a[n-1]);
		//System.out.println(a[0]+" "+a[n-1]);
		int s=(int)sum;
		System.out.println(s);
	}
}
