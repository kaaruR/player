import java.util.Scanner;
public class primrang {
private static Scanner sc;
public static void main(String args[])
{
sc = new Scanner(System.in);
System.out.println("enter the starting range");
int start=sc.nextInt();
System.out.println("enter the ending range");
int end=sc.nextInt();
int count=0;
int flag=0;
for(int i = start; i <= end; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
            	count=count+1;
            }
            if(i==2)
            {
            	count=count+1;
            }
        }
                System.out.println(count);
            
}
}
