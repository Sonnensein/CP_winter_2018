package pl.waw.sgh;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];

        arr2d[0][0] = 1;
        arr2d[1][1] = 2;
        arr2d[2][0] = 9;
        arr2d[3][2] = 5;
        arr2d[4][3] = 6;
        arr2d[2][4] = 7;
        arr2d[4][4] = 7;

        // exercise 1 -> print the entire matrix
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr2d.length; i++ ) {
            System.out.print(Arrays.toString(arr2d[i]));
            System.out.println(IntStream.of(arr2d[i]).sum());
            for (int j = 0; j < arr2d.length; j++) {
                arr[i] += arr2d[j][i];
            }
        }

        for (int i : arr){
            System.out.print(i + "  ");
        }

        for (int i = 0; i < arr2d.length; i++) {
            sum += IntStream.of(arr2d[i]).sum();
        }
        System.out.println(sum);
    }

    }



