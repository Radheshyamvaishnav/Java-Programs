import java.util.Scanner;
import java.util.ArrayList;

class attendence
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String name;
System.out.println("");
System.out.println("\tATTENDENCE FOR THE YEAR 2019-2020");
System.out.println("Total number of days college was open :-300");
System.out.print("Enter name of student:-");
name=scan.nextLine();
System.out.print("Enter the number of days student attended lectures:-");
int n;
n=scan.nextInt();
if(n<=225)
{
System.out.println("You are blacklisted");
}
else
{
System.out.println("You are not blacklisted");
}
}
}