import java.util.*;
import java.lang.*;
import java.io.*;
public class Divide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=0;
		while(a>=b)
		{
			a=a-b;
			i++;
		}
		System.out.println(i);
	}
}
