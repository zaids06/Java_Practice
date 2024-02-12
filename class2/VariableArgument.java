package class2;

public class VariableArgument {
    static void function(int...a){
        int total=0;
        for(int i:a)
        total+=i;
        System.out.println(total);
    }
    public static void main(String[] args) {
        function(1,2,3,4,5);
    }
}
