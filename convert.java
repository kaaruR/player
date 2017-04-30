import java.io.*;
import java.util.Scanner;
public class convert
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter a number");
String s=sc.next();
int a=Integer.parseInt(s);
System.out.println("converted number"+a);
}
}