package class7;

public class Box {
    double height,width,depth;
    Box()
    {
        height=-1;
        width=-1;
        depth=-1;
    }
    Box(double L)
    {
        height=L;
        width=L;
        depth=L;
    }
    Box(double a,double b, double c)
    {
        height=a;
        width=b;
        depth=c;
    }
    double volume()
    {
        return height*width*depth;
    }

    public static void main(String[] args) {
        int n=3;
        if(n==0)
        {
            Box b=new Box();
            System.out.println("Volume with 0 arg is "+b.volume());
        }
        else if(n==1)
        {
            double d=3.2;
            Box b=new Box(d);
            System.out.println("Volume of cube with arg1 is "+b.volume());
        }
        else if(n==3)
        {
            double a=2.2,b=3.3,c=4.4;
            Box bo = new Box(a,b,c);
            System.out.println("Volume of cuboid is "+bo.volume());
        }
    }
}
