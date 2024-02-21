package class7;

import java.sql.ResultSet;

class Student{
    int id;
    String name;
    public void setData(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public  void displayData()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}
class  Marks extends Student{
    float javaMarks,CMarks,cppMarks;
    public void setMarks(float javaMarks, float CMarks, float cppMarks)
    {
        this.javaMarks=javaMarks;
        this.CMarks=CMarks;
        this.cppMarks=cppMarks;
    }
    public void displayMarks()
    {
        System.out.println("Java marks: "+javaMarks);
        System.out.println("C marks: "+CMarks);
        System.out.println("CPP marks: "+cppMarks);
    }
}
class MultiLevel extends  Marks {
    float total, avg;
    public void compute()
    {
        total=javaMarks+CMarks+cppMarks;
        avg=total/3;
    }
    public void showResult()
    {
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+avg);
    }
    public static void main(String[] args) {
        int id=Integer.parseInt(args[0]);
        float jM=Float.parseFloat(args[2]);
        float cM=Float.parseFloat(args[3]);
        float cppM=Float.parseFloat(args[4]);
        MultiLevel ob= new MultiLevel();
        ob.setData(id,args[1]);
        ob.setMarks(jM,cM,cppM);
        ob.displayData();
        ob.displayMarks();
        ob.compute();
        ob.showResult();
    }
}
