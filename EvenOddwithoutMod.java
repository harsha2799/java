import java.util.Scanner;
class EvenOddwithoutMod
{
public static void main(String[] args)
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
 if(x/2*2==x)
{
System.out.println(x+ "is even");
}
else{
System.out.println(x+"is odd");
}
}
}

