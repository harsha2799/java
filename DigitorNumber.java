import java.util.Scanner;
class DigitorNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter an integer value");
int x=sc.nextInt();
if(x>=-9 && x<=9)                                                
System.out.println(x+ "is a digit");
else
System.out.println(x+ "is a number");
}
}