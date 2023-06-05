import java.util.Scanner;
public class ProductOfDigits
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int n;//to hold number
int pd=0;//to hold product of digits
System.out.println("Enter any poisitive integer:");
n=sc.nextInt();
while(n>0){
pd=pd*n%10;
n=n/10;
}
System.out.println(pd);
}
}
