
//counting vowles of a char in str by using charAt() method
public class countvowels{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((str.charAt(i)=='a')||(str.charAt(i)=='e')||
(str.charAt(i)=='i')||(str.charAt(i)=='o')||
(str.charAt(i)=='u')||(str.charAt(i)=='a')||
(str.charAt(i)=='e')||(str.charAt(i)=='i')||
(str.charAt(i)=='o')||(str.charAt(i)=='u'))||{
count++;
}
}
System.out.println(count);
}
}
