import java.util.*;
class Result10
{
public static void main (String args[])
{
Scanner a=new Scanner(System.in);
int Total;
System.out.println("Enter the marks obtained in English ");
int e=a.nextInt();
System.out.println("Enter the marks obtained in Maths ");
int m=a.nextInt();
System.out.println("Enter the marks obtained in History ");
int H=a.nextInt();
System.out.println("Enter the marks obtained in Science ");
int S=a.nextInt();
System.out.println("Enter the marks obtained in Geography ");
int G=a.nextInt();
System.out.println("Enter the marks obtained in Hindi ");
int Hin=a.nextInt();
System.out.println("Enter the marks obtained in Marathi ");
int Mar=a.nextInt();
 Total=e+m+H+S+G+Hin+Mar;
System.out.println( "Total marks = "+Total+" out of 560");
if(Total<224)
{
	System.out.println("OOPS!! you are fail");
	System.out.println("try next time");
}
if(TOtal>=336)
{
	System.out.println("Scored first class");

}
if(Total>449)
{
	System.out.println("Congratullations..... You Scored above 80 percent!!!!!");
}
}
}