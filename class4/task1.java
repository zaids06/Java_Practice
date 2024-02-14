package class4;

public class task1 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3="He";
        String s4=new String("Hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1==s4);
        //use intern method for this to be equal
//        System.out.println(s1.startsWith(s5));
    }
}
