import java.util.Scanner;
public class ReverseOfDigits
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int n;//to hold number
int rd=0;//to hold Reverse of digits
System.out.println("Enter any poisitive integer:");
n=sc.nextInt();
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
System.out.println(rd);
}
}
