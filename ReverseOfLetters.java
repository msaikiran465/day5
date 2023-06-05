import java.util.Scanner;
public class ReverseOfLetters
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
String str;//to hold string
String rs="";//to hold Reverse of string
System.out.println("Enter a string:");
str=sc.next();
int len=str.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+str.charAt(i);
}
System.out.println(rs);
}
}
