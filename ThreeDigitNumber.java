import java.util.Scanner;
class ThreeDigitNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int x=sc.nextInt();
if(x>=-999 && x<=-100||x<=999 && x>=100)
{
System.out.println("Its a 3 digit number");
}
else{
System.out.println("Its not a 3 digit number");
}
}
}