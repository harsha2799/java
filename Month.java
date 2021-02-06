import java.util.Scanner;
class Month
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter month");
  int x=sc.nextInt();
if(x>0&&x<=12)
{
System.out.println(x+" is a valid month");
}
else{
System.out.println(x+" is an invalid month");
}
}
}


