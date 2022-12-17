package java_intermediate.exception_handling.exel_Io;

public class ExelReadMultiDimentionalArray {
    public static void main(String[] args) {

        //regular array
        int[] arr = {10,20,30};
                           //1st row   //2nd row     //3rd row
        int[][] multiArr ={{10,20,30},{100,200,300},{1000,2000,3000}};

        //System.out.println(multiArr[1][2]);

        for (int row = 0; row < multiArr.length; row++ ){

            for (int column = 0; column < multiArr[row].length; column++ ){

                System.out.print(multiArr[row][column] + "\t");
            }
            System.out.println();
        }
    }
    }
