import java.util.Scanner;
class MarksofStudent
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter an marks of student");
int p=sc.nextInt();
int c=sc.nextInt();
int m=sc.nextInt();
int e=sc.nextInt();

if(p>=35 && c>=35 && m>=35 && e>=35)
System.out.println("pass");
else
System.out.println("fail");
}
}
