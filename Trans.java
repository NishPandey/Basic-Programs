import java.util.*;
public class Trans
{
public static void main(String args[])
{
Scanner r=new Scanner(System.in);
int i,j;
System.out.println("Enter no. of row and col");
int row=r.nextInt();
int col=r.nextInt();
int a[][]=new int [row][col];
System.out.println("Enter mat:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
 a[i][j]=r.nextInt();
}
}
System.out.println("Orig mat is ");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Transpose of matrix is:");
for(i=0;i<col;i++)
{
for(j=0;j<row;j++)
{
System.out.print(a[j][i]+ " ");
}
System.out.println();
}
}
}