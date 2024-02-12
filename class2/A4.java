package class2;
class B{
A4 obj;
B(A4 obj){
    this.obj=obj;
}
void display(){
    System.out.println(obj.data);
}
}
public class A4 {
    int data=10;
    A4() {
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args) {
        A4 ob= new A4();
    }
}
