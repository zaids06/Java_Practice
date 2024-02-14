package class3;
public class task1 {
    int x=4;
    int y=6;
    task1 (int a)
    {
        this(3, 4);
        System.out.println(this.x);
    }
    task1 (int b,int c)
    {
        System.out.println(this.x+" "+this.y);
    }
    task1() {
        this(2); // Invoking the constructor with a single parameter
         // Invoking the constructor with two parameters
        System.out.println("Inside default constructor");
    }

    public static void main(String[] args) {
    task1 ob= new task1();
    }
}
