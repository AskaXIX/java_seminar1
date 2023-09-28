package java_seminar1;

import java.util.Arrays;

public class program2 {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        /*
         * Текст задачи:
         * Дан массив nums = [3,2,2,3] и число val = 3.
         * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
         * конец массива.
         * Таким образом, первые несколько (или все) элементов массива должны быть
         * отличны от заданного, а остальные - равны ему.
         */
        int[] nums = { 3, 2, 2, 3, 45, 4, 5, 7, 9, 3, 3, 3, 4, 8, 7, };
        int val = 3;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }
}
