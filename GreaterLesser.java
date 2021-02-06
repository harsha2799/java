import java.util.Scanner;
class GreaterLesser
{
public static void main(String[] args)
{
System.out.println("enter  2 integer values");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
if(x>y)
{
System.out.println(x+"is greater than "+ y + " by " + (x-y) + " numbers");
}
else{
System.out.println(x+"is lesser than "+ y + " by " + (y-x) + " numbers");
}
}
}