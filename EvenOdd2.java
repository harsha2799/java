import java.util.Scanner;
class EvenOdd2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int m=sc.nextInt();

switch(m%2)
{+
case 0:   System.out.println("Even number"); 
break;
case 1:   System.out.println("Odd number");
}
}
}
