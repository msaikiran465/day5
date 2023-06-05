//creating two objects
class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void calculateArea(){System.out.println(length*width);}
}
class TestRectangle2{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();
r1.insert(4,2);
r2.insert(3,56);
r1.calculateArea();
r2.calculateArea();
}
}
