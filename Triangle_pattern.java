import java.util.*;
import java.lang.*;
import java.io.*;
public class Triangle_pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<2*i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
