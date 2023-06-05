class Teststringcomparison3{
public static void main(String args[]){
String s1="SAchin";
String s2="Sachin";
String s3=new String("SAchin");
System.out.println(s1==s2);//true(because both refer to same instance)
System.out.println(s1==s3);//false(because s3 refers toi instance created in nonpool)
}}