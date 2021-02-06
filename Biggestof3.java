import java.util.Scanner;
class Biggestof3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 3 integer value");

int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();

if(x>y && x>z)

 System.out.println(x+ "is biggest");

else if(y>z)

  System.out.println(y+ "is biggest");

else

  System.out.println(z+ "is biggest");

}
}