import java.util.Scanner;
import java.util.Random;

class duplicate
{

public static void main(String args[])
{
Random rd=new Random();

int a=rd.nextInt(10);
int b=rd.nextInt(10);
int c=rd.nextInt(10);
int d=rd.nextInt(10);
int e=rd.nextInt(10);
System.out.println("RANDOM NUMBERS CREATED BY COMPUTER ARE:-");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
if(a==b ||a==c|| a==d || a==e || b==c || b==d || b==e || c==d || c==e || d==e)
{
System.out.println("\t\tNumbers In This List Are Duplicate");
}
else
{
System.out.println("\t\tNumbers In This List Are Not Duplicate");
}
}
}