class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void claculateArea(){System.out.println("area of a rectangle==>"+(length*width));}
}
class TestRectangle1{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(23,5);
r2.insert(8,21);
r1.claculateArea();
r2.claculateArea();
}
}
