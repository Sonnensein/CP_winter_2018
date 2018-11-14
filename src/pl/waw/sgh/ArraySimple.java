package pl.waw.sgh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySimple {
    public static void main(String[] args) {
        //int[] arrint = new int[1];
        Integer[] arrInt = new Integer[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 5;

        //for (int i=0;i<arrInt.length;i++) {
          //  System.out.println("Elem " + i +" = "  + arrInt[i] + 10);

        System.out.println(Arrays.toString(arrInt));
        String[] arrStr = new String[]{
                "abc", "def", "ghi"
        };
        System.out.println(Arrays.toString(arrStr));



    }
    }

