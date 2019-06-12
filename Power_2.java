import java.util.*;
import java.lang.*;
import java.io.*;
public class Power_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		while(a>1)
		{
			b=a%2;
			a=a/2;
		}
		if(b==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
