import java.util.Scanner;
class MarksCategory
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
if(m1<=35||m2<=35||m3<=35||m4<=35)
{
System.out.println("FAIL");
}
else 
{
double per=(m1+m2+m3+m4)/4.0;
if(per>=85)
System.out.println("Distinction");

else if(per>=60)
System.out.println("First Class");

if(per>=50)
System.out.println("Second class");

else
System.out.println("pass");
}
}
}


