import java.util.Scanner;
class NPowerP{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n and p");
int n=sc.nextInt();
int p=sc.nextInt();
int ans=1;
while(p>0)
{
	ans=ans*n;
	p--;
}
	System.out.println(ans);
}
}