class StrBuilder
{
public static void main(String args[])
{
StringBuilder s1=new StringBuilder("Hello");//string 1
StringBuilder s2=new StringBuilder("World");//string 2
StringBuilder s=s1.append(s2);//string 3 to store the result
System.out.println(s.toString());//displayresult
}
}