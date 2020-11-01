//WAJP to convert number to words....

import java.util.Scanner;
import java.io.*;


class numtowrds
{
public static void main(String args[])throws IOException
{
String units[]= {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"};
String twoDigits[]= {" ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
String tenMultiples[]= {"",""," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};


BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String[] input = new String[4]; 
int a,b,c,d; 
 

System.out.println();
System.out.print("Please ENter only Four digit number:-");
input = in.readLine().split(""); 

a = Integer.parseInt(input[0]); 
b = Integer.parseInt(input[1]); 
c = Integer.parseInt(input[2]); 
d = Integer.parseInt(input[3]); 

System.out.print(units[a]+" thousand ");
System.out.print(units[b]+" hundread and ");
System.out.print(tenMultiples[c]);
System.out.print(units[d]); 

}}