public class StrJoin{
public static void main(String args[]){
String s1=new String("Hello");//string 1
String s2=new String("World");//string 2
String s3=new String("Java");//string 3
String s=String.join("#",s1,s2);//string 3 to store the result
System.out.println(s.toString());//Display result
}
}