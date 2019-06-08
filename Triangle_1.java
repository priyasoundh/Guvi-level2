import java.util.*;
import java.lang.*;
import java.io.*;
public class Triangle_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
