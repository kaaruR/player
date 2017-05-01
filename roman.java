import java.io.*;
import java.util.Scanner;
public class roman1
{
public static void main(String args[])
{
roman1 fn=new roman1();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the roman letter");
String r=sc.next();
int sum=0;
for(int i=0;i<r.length();i++)
{
if(i+1<r.length())
{
int tv1=fn.findno(r.charAt(i));
int tv2=fn.findno(r.charAt(i+1));
if(tv1>=tv2)
{
sum=sum+tv1;
}
else
{
sum=sum+tv2-tv1;
i++;
}
}
else
{
int tv1=fn.findno(r.charAt(i));
sum=sum+tv1;
i++;
}
}
System.out.println("sum"+sum);
}
public int findno(char r)
{
if(r=='I')
return 1;
if(r=='V')
return 5;
if(r=='X')
return 10;
if(r=='L')
return 50;
if(r=='C')
return 100;
if(r=='D')
return 500;
if(r=='M')
return 1000;
return -1;
}
}
