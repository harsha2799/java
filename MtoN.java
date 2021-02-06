import java.util.Scanner;
class MtoN{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int m=sc.nextInt();
int n=sc.nextInt();

while(m<=n)
{
System.out.println(m);
m++;
}
}
}