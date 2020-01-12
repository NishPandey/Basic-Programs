import java.util.*;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first integer");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(" after Swapping the value of first integer is "+ a +" and second integer is "+b);
}
}