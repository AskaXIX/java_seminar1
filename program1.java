package java_project;

public class program1 {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        /*
         * Текст задачи:
         * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
         * количество подряд идущих 1.
         */

        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 0};
        int count = 0;
        int max_ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            }else{
                if(count > max_ones){
                    max_ones = count;
                }
                count = 0;
            }
        }
        if(count > max_ones){
            max_ones = count;
        }
        System.err.println(max_ones);
    }
}
