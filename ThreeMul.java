import java.util.Scanner;
class ThreeMul{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int i=1;
while(i<=n)
{
if(i%3==0)
{
System.out.println(i);
}
i++;
}
}
}