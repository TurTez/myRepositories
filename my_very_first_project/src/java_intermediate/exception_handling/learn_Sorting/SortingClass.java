package java_intermediate.exception_handling.learn_Sorting;

public class SortingClass {
    public static void main(String[] args) {
        int[] sort = {20, 55, 85, 10, 9, 1, 4, 8};

        for (int a = 0; a<sort.length; a++){

            for (int b = a+1; b < sort.length; b++){

                int tmp;

                if (sort[b] < sort[a]){

                    tmp = sort[a];

                    sort[a] = sort[b];

                    sort[b] = tmp;
                }
            }
            System.out.println(sort[a]);
        }
    }
}
