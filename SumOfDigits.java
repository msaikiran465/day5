import java.util.Scanner;
public class SumOfDigits
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int n;//to hold number
int sd=0;//to hold sum of digits
System.out.println("Enter any poisitive integer:");
n=sc.nextInt();
while(n>0){
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}
