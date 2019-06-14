import java.util.*;
import java.lang.*;
import java.io.*;
public class String_mul
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a*b;
		String s=String.valueOf(c);
		System.out.println(s);
	}
}
