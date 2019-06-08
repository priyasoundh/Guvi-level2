import java.util.*;
import java.lang.*;
import java.io.*;
public class Camelcase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split("\\s");
		int count=0,c=0;
		for(String w:s1)
		{
			char ch[]=w.toCharArray();
			if(ch[0]>='A'&&ch[0]<='Z')
			{
				count++;
			}
			c++;
		}
		if(count==c)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
