import java.util.Scanner;

class movie
{
public static void main(String args[])
{
System.out.println("");
System.out.println("\tMOVIE GUESS GAME");
System.out.println("-->YOU wILL GET FIVE CHANCE TO GUESS THE MOVIE");
System.out.print("HINT----->");
System.out.println("D _ _ _ _ N _ _ E");

String movi="deathnote";
Scanner sc=new Scanner(System.in);
String name,n;
for(int i=1;i<6;i++)
{
System.out.println("");
System.out.println("\tCHANCE NO."+i);
System.out.println("Enter the name of movie:-");
name=sc.nextLine();
n=name.toLowerCase();
if(movi.equals(n))
{
System.out.println("YOU WIN");
break;
}
else
{
System.out.println("YOU LOOSE");
}
}
}
}