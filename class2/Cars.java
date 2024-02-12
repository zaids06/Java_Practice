package class2;
class car{
    String str;
    int miles;
    car(String str,int miles){
        this.str=str;
        this.miles=miles;
    }
    void display(){
        System.out.println("Name of car is "+str+" miles is "+miles);
    }
}
public class Cars {
    public static void main(String[] args) {
        car[] obj=new car[4];
        obj[0]=new car("Maruti",50000);
        obj[1]=new car("Hyundai",3500);
        obj[2]=new car("Toyota",222222);
        obj[3]=new car("Honda",11111);
        for(car s: obj)
            s.display();
    }
}
