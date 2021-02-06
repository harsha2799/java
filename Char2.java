+import java.util.Scanner;
class Char2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char ch=sc.next().charAt(0);

if(ch>=65 && ch<=90 || ch>='a' && ch<='z')
System.out.println("alphabet");

else if(ch>=48 && ch<=57)
System.out.println("digit");

else
System.out.println("special characters");

}
}
}
