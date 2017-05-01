import java.io.*;
import java.util.Scanner;
public class swapoe
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.next();
char[] ch=s.toCharArray();
if(s.length()%2==0)
{
for(int i=0;i<s.length();i++)
{
char temp=ch[i];
ch[i]=ch[i+1];
ch[i+1]=temp;
++i;
}
s=new String(ch);
System.out.println(s);

}
else
{
System.out.println("enter a valid string");
}
}
}