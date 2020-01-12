import java.util.*;
class Fibonacci
{
public static void main(String args[])
{ int n1=0,n2=1,temp,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of terms for series");
 int count=sc.nextInt();
 System.out.println("Fibonacci series are:  ");
System.out.println("  "+n1);
	System.out.println("  "+n2);
for(i=2;i<count;++i)
{

	temp=n1+n2;
n1=n2;
n2=temp;

System.out.println("  "+temp);
}
}
}