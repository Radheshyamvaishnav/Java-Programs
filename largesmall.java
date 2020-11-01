//Program No:- 5

import java.util.Scanner;
import java.util.Random;

class largesmall 
{

public static void main(String args[])
{
Random rd=new Random();
int a=rd.nextInt(12);
int b=rd.nextInt(12);
System.out.print("Your Number is :-  ");
System.out.println(a);
System.out.print("Computer's Number is :-  ");
System.out.println(b);
if(a>b)
{
System.out.println("------------->Hooray! YOU WIN");
}
else
{
System.out.println("-------------->BETTER LUCK NEXT TIME____YOU LOOSE");
}
}
}