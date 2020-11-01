import java.util.Scanner;

class marksheet
{
public static void main(String args[])
{
String name,college;
int total,ip,de,os,cs,am,rollno;
float cgpa, per;

college="KISHINCHAND CHELLARAM COLLEGE, MUMBAI";
name="ANKIT SINGH";
rollno=10;
ip=88;
de=89;
os=90;
cs=91;
am=92;
total=ip+de+os+cs+am;
per=total/5;
cgpa=per/10;
System.out.println("");
System.out.println("");
System.out.println("\t"+college);
System.out.println("NAME:-"+name+"\t     ROLL NO:-"+rollno);
System.out.println("____________________________________________________");
System.out.println("Subjects                 	Marks\tTOTALMARKS");
System.out.println("____________________________________________________");
System.out.println("Imperative Programming		"+ip+"\t100");
System.out.println("Digital Eletronics          	"+de+"\t100");
System.out.println("Operating System            	"+os+"\t100");
System.out.println("Applied Mathematics         	"+am+"\t100");
System.out.println("Communication Skills        	"+cs+"\t100");
System.out.println("____________________________________________________");
System.out.println("Total Marks:-"+total+"/500");
System.out.println("Percentage:-"+per);
System.out.println("CGPA:-"+cgpa);
if (cgpa<3)
{
System.out.println("Result:-Fail");
}
else
{
System.out.println("Result:-Pass");
}
}
}