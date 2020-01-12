import java.util.*;
class CelToFeh
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in celcius");
int celsius=sc.nextInt();
int Fahrenheit=(9/5)*celsius+32;
System.out.println("Temperature in fahrenheit is "+Fahrenheit);

}
}