package  class8;
public class Final {
    final int speedlimit=90;
    void run(){
        //speedlimit=400;
    }

    public static void main(String[] args) {
        Final obj= new Final();
        obj.run();
        System.out.println(obj.speedlimit);
    }
}