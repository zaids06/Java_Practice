package class5;

public class InitializerBlock {
    public int x;
    {
        System.out.println("This is the first initializer block");
        x=10;
    }
    InitializerBlock(){
        System.out.println("Default constructor "+ x);
    }
    {
        System.out.println("This is second initializer block");
        x=20;
    }

    public static void main(String[] args) {
        InitializerBlock obj = new InitializerBlock();
    }
}
