package class2;
class A{
    A getA(){
        return this;
    }
    void msg(){
        System.out.println("Hello java");
    }
}
public class Test1 {
    public static void main(String[] args) {
        new A().getA().msg();
    }
}
