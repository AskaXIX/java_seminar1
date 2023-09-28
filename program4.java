package java_project;

import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        task1();
    }

    static void task1() {

        /*
         * 📔 **Текст задачи:**
         * 
         * Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя
         * количество выполняемых действий к минимуму.
         * 
         * Пример 1: а = 3, b = 2, ответ: 9
         * 
         * Пример 2: а = 2, b = -2, ответ: 0.25
         * 
         * Пример 3: а = 3, b = 0, ответ: 1
         */
        System.out.printf("Введите число a = ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.printf("Введите число b = ");
        int b = scanner.nextInt();
        int c = a;
        for (int i = 0; i < b - 1; i++) {
            a *= c;
        }
        System.out.printf("a в степени b = " + a);

        scanner.close();

    }
}
