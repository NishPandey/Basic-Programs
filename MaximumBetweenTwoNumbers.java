import java.util.*;
class MaximumBetweenTwoNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numers");
int a =sc.nextInt();
int b = sc.nextInt();
if(a>b)
{
System.out.println("Greater Number is "+a);
}
else
{
System.out.println("Greater Number is "+b);
}
}
}