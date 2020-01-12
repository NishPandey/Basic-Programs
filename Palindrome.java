import java.util.Scanner;
public class Palindrome
{
public static void main(String arg[])
{Scanner s =new Scanner(System.in);
System.out.print("Enter no to check:");
int no=s.nextInt();
int sum=0,temp,r;
temp=no;
while(no!=0)
{
r=no%10;
sum=(sum*10)+r;
no=no/10;
}
if(temp==sum)
System.out.print("Palindrome: ");
else
System.out.print("Not palindrome ");
}
}