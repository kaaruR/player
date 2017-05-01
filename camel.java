import java.util.Scanner;

public class camel {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	System.out.print(Character.toUpperCase(ch[0]));
	for(int i=1;i<s.length();i++)
	{
		if(ch[i]==' ')
		{
			System.out.print(" "+Character.toUpperCase(ch[i+1]));
			i++;
		}
		else
		{
			System.out.print(ch[i]);
			
		}
	
	}
	}

}
