package start.Lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
//        int[] array = new int[2];
//        array[0] = x;
//        array[1] = y;
//        int [] array = new int[]{x, y};
        int [] array = {x, y};
         int[] array2 = array;

        array2[0] = 13;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
