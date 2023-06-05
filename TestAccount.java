//java prm to demonstrate the working of a banking-system
//where we deposit and withdraw amt from our acccout
class Account{
int acc_no;
String name;
float amount;
//initilize object
void insert(int a ,String n ,float amt){
acc_no=a;
name=n;
amount=amt;
}
//deposit method
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
//withdraw method
void withdraw(float amt){
if(amount<amt){
System.out.println("Insufficient Balance");
}
else
{
amount=amount-amt;
System.out.println(amt+"withdraw");
}
}
//method to check the balance of the account
void checkBalance(){System.out.println("Balance is:"+amount);}
//method to display value of an object
void display(){System.out.println(acc_no+""+name+""+amount);}
}
//creating test class to deposit and withdraw amount
class TestAccount{
public static void main(String[] args){
Account a1=new Account();
a1.insert(344546,"kiran",2000);
a1.display();
a1.checkBalance();
a1.deposit(500000);
a1.checkBalance();
a1.withdraw(16000);
a1.checkBalance();
}
}



