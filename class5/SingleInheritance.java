package class5;

class A{
    void display(){
        System.out.println("This is the base class message");
    }
}
class B extends A{
    void display1(){
        System.out.println("Derived class content.");
    }
}
class C extends B{
    void display2(){
        System.out.println("Derived from derived class");
    }
}
public class SingleInheritance extends A{
    public static void main(String[] args) {
        C obj1=new C();
        obj1.display();
        obj1.display1();
        obj1.display2();
    }
}
