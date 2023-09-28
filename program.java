package java_seminar1;

import java.time.LocalTime;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        /*
         * <aside>
         * 📔 **Текст задачи:**
         * В консоли запросить имя пользователя. В зависимости от текущего времени,
         * вывести приветствие вида
         * 
         * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
         * 
         * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
         * 
         * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
         * 
         * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         * 
         * </aside>
         */
        System.out.println("Whats ur name?");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();

            LocalTime localTime = LocalTime.now();
            int hour = localTime.getHour();

            if (hour >= 5 && hour < 12) {
                System.out.println("Good morning " + name);
            } else if (hour > 18) {
                System.out.println("Good afternoon " + name);
            } else if (hour > 23) {
                System.out.println("Good evening " + name);
            } else {
                System.out.println("Good night " + name);
            }
        }
    }
}