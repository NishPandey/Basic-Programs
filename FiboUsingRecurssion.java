import java.util.*;
public class FiboUsingRecurssion
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Number of terms for series");
 int count=sc.nextInt();
 int n1=0,n2=1;

 System.out.println(n1+" "+n2);
 fibo(count-2);
 System.out.println("Fibonacci series are: ");
}
   public static int fibo( int count)
  {int temp, n1=0,n2=0;
	  if(count>0)
	  {
		 temp = n1+n2;
		  n1=n2;
		  n2=temp;
System.out.println(temp);
}
return(count-1);
}
}