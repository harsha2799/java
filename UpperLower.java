import java.util.Scanner;
class UpperLower
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabet");
int ch=sc.next().charAt(0);
if(ch>=65&& ch<=90)
{
System.out.println("UPPER CASE");
}
else if(ch>='a'&&ch<='z')
{
System.out.println("LOWER CASE");
}
}
}