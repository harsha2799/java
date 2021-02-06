import java.util.Scanner;
class Bignumber
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter hte number");
int x=sc.nextInt();
int y=sc.nextInt();
if(x>y)
{
System.out.println(x+ "is biggest");
}
else
{
System.out.println(y+"is biggest");
}
}
}