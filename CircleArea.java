import java.util.Scanner;
class CircleArea
{
public static void main(String[] args)
{
System.out.println("enter the radius of a circle");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println(x +"radius circle area is:"+ (2*3.14*x*x));
System.out.println(x +"radius circle circumference is:"+ (2*3.14*x));
}
}
