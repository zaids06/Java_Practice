public class Task2 {
    public static void main(String[] args) {
        int num_Array[]={1,2,3,4,5};
        int clone_Array[]=num_Array.clone();
        num_Array[0]=2;
        for (int i:num_Array)
        System.out.print(i+" ");
        System.out.println();
        for(int i:clone_Array)
        System.out.print(i+" ");
    }
}
