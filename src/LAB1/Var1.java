package LAB1;

import java.util.Random;
import java.util.Scanner;


public class Var1 {

    public static void main(String[] args) {

        int N, tmp;
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите кол-во элементов массива");
        N = in.nextInt();

        // Заполнение ранд числами
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(1000);
        }

        // Вывод
        for (int i = 0; i < N; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("\n");

        // Сортировка
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        // Вывод
        for (int i = 0; i < N; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
