import java.util.Scanner;
class RectSqr
{
public static void main(String[] args)
{
System.out.println("enter  length and breadth of rectangle");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
if(x==y)
{
System.out.println("this rect is a square");
}
else{
System.out.println("this rect is not a square");}
}
}
