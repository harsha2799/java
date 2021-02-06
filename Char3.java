import java.util.Scanner;
class Char3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");   
char ch=sc.next().charAt(0);
if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
{
if(ch=='A' ||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
System.out.println("vowel");

else 
System.out.println("consonant");
}
else{
System.out.println("not a alphabet");
}
}
}