import java.util.Scanner;
class SmallestOf3
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(x<y&&x<z)
{
 System.out.println(x+" is smallest");
}
else if(y<x&&y<z)
{
 System.out.println(y+" is smallest");
}
else{
 System.out.println(z+" is smallest");
}
}}




  
