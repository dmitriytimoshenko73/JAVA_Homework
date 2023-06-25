//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Homework2;

import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
      int[] arr = {5, 1, 4, 2, 8};

        // Открытие лог-файла для записи
        FileWriter writer = null;
        try {
            writer = new FileWriter("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Печать исходного массива в лог-файл
        printArray(arr, writer, "Исходный массив:");

        // Сортировка пузырьком
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // Печать текущего состояния массива в лог-файл
            printArray(arr, writer, "После " + (i+1) + "-й итерации:");
        }

        // Закрытие лог-файла
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для печати массива в лог-файл
    public static void printArray(int[] arr, FileWriter writer, String message) {
        try {
            writer.write(message + "\n");
            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i] + " ");
            }
            writer.write("\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


