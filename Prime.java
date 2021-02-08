import java.util.Scanner;
class Prime{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int i=2;
while(i<=n)
{
if((n%n==0)&&(n%i!=0))
{
System.out.println(n+ "is prime");
}
i++;
}}
}
