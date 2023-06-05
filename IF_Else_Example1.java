import java.util.Scanner;
class IF_Else_Example1
{
public static void main(String args[]){
int i,j;
Scanner s=new Scanner(System.in);
i=s.nextInt();
j=s.nextInt();
if(j==0)
{
System.out.println("Division by 0 error");}
else
{
System.out.println(i+"divided by "+j+" is"+(i/j));}
}
}
