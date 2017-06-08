import java.util.Scanner;
import java.lang.String;
public class converttime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting time in hh:mm form");
		String start=sc.nextLine();
		System.out.println("enter the end time in hh:mm form");
		String end=sc.nextLine();
		String str2[]=end.split(":");
		String[] str1 = start.split(":");
		int[] num1 = new int[str1.length];
		int[] num2=new int[str2.length];
		for(int i = 0;i < str1.length;i++)
		   num1[i] = Integer.parseInt(str1[i]);
		for(int i = 0;i < str2.length;i++)
		   num2[i]=Integer.parseInt(str2[i]);
		int hourdif=num2[0]-num1[0];
		int hourmin=hourdif*60;
		int mindif=num2[1]-num1[1];
		int totdiff=hourmin+mindif;
		System.out.println(totdiff);
	}
	
}
