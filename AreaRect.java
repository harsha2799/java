import java.util.Scanner;
class AreaRect
{
public static void main(String[] args)
{
System.out.println("enter the length and breadth of a rectangle");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println(x +"length and"+y+"breadth area is :"+(x*y));
System.out.println(x +"length and"+y+"breadth perimeter is :"+(2*(x+y)));
}
}


