import java.util.Scanner;
class LeapYear
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
int x=sc.nextInt();

if(x%4==0 &&  x%100!=0 ||x%400==0)
{
System.out.println("Leap year");
}
else{
System.out.println("not a leap year");
}}
}

 
