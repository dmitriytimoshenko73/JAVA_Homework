// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package Homework3;

import java.util.ArrayList;
import java.util.List;

public class task {
    public static void main(String[] args) {
         // Произвольный список целых чисел
        List<Integer> numbers = new ArrayList< >();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);

        // Удаление чётных чисел
        List<Integer>  oddNumbers = new ArrayList< >();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        // Поиск минимального значения
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
        //for (int number : oddNumbers) { - для поиска минимального значения из полученного списка
            if (number < min) {
                min = number;
            }
        }

        // Поиск максимального значения
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
        //for (int number : oddNumbers) { - для поиска максимального значения из полученного списка
            if (number > max) {
                max = number;
            }
        }

        // Вычисление среднего значения
        double sum = 0;
        for (int number : numbers) {
        //for (int number : oddNumbers) { - для вычисления среднего значения из полученного списка
            sum += number;
        }
        double average = sum / numbers.size();
        //double average = sum / oddNumbers.size();

        // Вывод результатов
        System.out.println("Исходный список: " + numbers);
        System.out.println("Список без чётных чисел: " + oddNumbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}

    