import java.util.*;
import java.lang.*;
import java.io.*;
public class Case
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		char ch[]=s.toCharArray();
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(ch[i]!=' ')
			{
				j++;
				if(j%2==1)
				{
					ch[i]=Character.toUpperCase(ch[i]);
				}
				else
				{
					ch[i]=Character.toLowerCase(ch[i]);
				}
			}
			System.out.print(ch[i]);
		}
	}
}
