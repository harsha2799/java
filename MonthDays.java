import java.util.Scanner;
class MonthDays
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month");
int x=sc.nextInt();
if(x==1||x==3||x==5||x==7||x==8||x==10||x==12)
{
System.out.println("31 DAYS");
}
else if(x==4||x==6||x==9||x==11)
{ 
System.out.println("30 DAYS");
}
else if(x==2)
{
System.out.println("28 DAYS");
}
else
{
System.out.println("Invalid month");
}
}
}