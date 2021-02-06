import java.util.Scanner;
class YourAge
{
public static void main(String[] args)
{
System.out.println("enter the age");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x>18)
{
System.out.println("you are voting from" +(x-18)+"years");
}
else{
System.out.println("you can vote after" +(18-x)+"years");
}
}
}



