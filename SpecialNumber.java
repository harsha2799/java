import java.util.Scanner;
class SpecialNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter an integer value");
int x=sc.nextInt();
int d1=x/10;
int d2=x%10;
int sum=d1+d2+d1*d2;
if(sum==x)
System.out.println(x+"is a special no");
   else
System.out.println(x+"is not a special no");
}
} 
