import java.util.Scanner;
import java.util.Random;
class randomcheck{

public static void main(String a[])
{
Random rd=new Random();

int rd_num=rd.nextInt(10);

Scanner scan=new Scanner(System.in);
int n,win=0,loose=0;
for(int i=0;i<3;i++)
	{
	System.out.print("Enter any integer from 0 to 10:- ");
	n=scan.nextInt();

	if(rd_num==n)
		{
		System.out.println("YOU WIN");
		win++;
		break;
		}
	else
		{
		System.out.println("You Loose");
		loose++;
		}
	}

}
}