package java_seminar1;

import java.util.Arrays;
import java.util.Collections;

public class program3 {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        /*
         * Текст задачи:
         * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
         * порядке.
         */

        String text = "Добро пожаловать на курс по Java";
        String[] arr = text.split(" ");
        String words = "";
        for (int i = 0; i < arr.length; i++) {
            words = words + arr[arr.length - 1 - i] + " ";
        }
        System.out.println(words);
        
        // Альтернативный вариант с функцией reverse
        String text_1 = "Добро пожаловать на курс по Java";
        String[] arr_string = text_1.split(" ");
        Collections.reverse(Arrays.asList(arr_string));

        System.out.println(Arrays.toString(arr_string));
    }
}
