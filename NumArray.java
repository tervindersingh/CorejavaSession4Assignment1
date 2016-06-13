
import java.io.*;
public class NumArray
{	public static void main(String args[]) throws Exception
	{	int []num=new int[10];
		String str;
		int i;					
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for (i=0;i<num.length;i++)
		{		
			System.out.print("Enter Number :");
			str=br.readLine();
			num[i]=Integer.parseInt(str);

		}
		}catch (IOException e)
		{	e.printStackTrace();
		}			

		System.out.println("Array Numbers are :");
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Array numbers are in reverse order as below:");
		for(i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}

}