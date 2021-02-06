import java.util.Scanner;
class ArithmeticOperation
{
public static void main(String[] args)
{
System.out.println(" enter 2 numbers");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();

System.out.println(x+"+"+y+"="+(x+y));
System.out.println(x+"-"+y+"="+(x-y));
System.out.println(x+"*"+y+"="+(x*y));
System.out.println(x+"%"+y+"="+(x%y));

}
}
