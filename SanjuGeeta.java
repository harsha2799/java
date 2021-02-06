import java.util.Scanner;
class SanjuGeeta
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter month");
  int x=sc.nextInt();
if(x%3==0 && x%5!=0)
{
System.out.println("SANJU");
}
else if(x%5==0 && x%3!=0)
{
System.out.println("GEETA");
}
else if(x%3==0 && x%5==0)
{
System.out.println("SANJU WEDS GEETA");
}
else{
System.out.println("BREAKUP");
}}}

