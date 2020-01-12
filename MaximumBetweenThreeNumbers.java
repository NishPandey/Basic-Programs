import java.util.*;
class MaximumBetweenThreeNumbers
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
System.out.println("Enter Three Numbers ");
int a = sc.nextInt();
int b =sc.nextInt();
int c = sc.nextInt();
if(a>b && a>c)
{
System.out.println("The Greatest Number is "+a);
}
if(b>a && b>c)
{
System.out.println("The Greatest Number is "+b);
}
if(c>a && c>b)
{
System.out.println("The Greatest Number is "+c);
}
}
}