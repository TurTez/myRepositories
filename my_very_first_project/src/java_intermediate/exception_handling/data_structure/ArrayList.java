package java_intermediate.exception_handling.data_structure;

public class ArrayList {
    public static void main(String[] args) {

        //int[] n = {10,20,30, 40};
       // System.out.println(n[3]);
        int[] n = new int[3];//max index is = length -1
        n[0] = 10;
        n[1] = 20;
        n[2] = 30;

        for(int a : n){
            System.out.println(a);
        }
    }
}
