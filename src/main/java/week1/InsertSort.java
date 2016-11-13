package week1;

import java.util.Arrays;

/**
 * Created by mhw on 2016/11/13.
 */
public class InsertSort {

        public static void insertSort(int[] array) {
            if (array == null || array.length < 2) {
                return;
            }

            for (int i = 1; i < array.length; i++) {
                int currentValue = array[i];
                int position = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] > currentValue) {
                        array[j + 1] = array[j];
                        position -= 1;
                    } else {
                        break;
                    }
                }

                array[position] = currentValue;
            }
        }

        public static void main(String[] args) {
            int[] array = { 3, -1, 0, -8, 2, 1 };
            insertSort(array);
            System.out.println(Arrays.toString(array));
        }

}
