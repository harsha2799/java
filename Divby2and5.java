import java.util.Scanner;
class Divby2and5
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int x=sc.nextInt();
if(x%5==0 && x%11==0)
System.out.println("true");
  else
System.out.println("false");
}
}
