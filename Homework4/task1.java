
// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
package Homework4;
import java.util.Deque;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
          // Пример 1: Умножение двух чисел
        Deque <Integer> num1 = new LinkedList < >();
        num1.add(2);
        num1.add(4);
        num1.add(3);

        Deque <Integer> num2 = new LinkedList < >();
        num2.add(5);
        num2.add(6);
        num2.add(4);

        Deque <Integer> result1 = multiplyNumbers(num1, num2);
        System.out.println("Произведение чисел: " + result1);

        // Пример 2: Сложение двух чисел
        Deque <Integer> num3 = new LinkedList < >();
        num3.add(7);
        num3.add(-2);
        num3.add(4);

        Deque<Integer> num4 = new LinkedList < >();
        num4.add(-5);
        num4.add(6);
        num4.add(4);

        Deque <Integer> result2 = addNumbers(num3, num4);
        System.out.println("Сумма чисел: " + result2);
    }

    // Метод для умножения двух чисел
    public static Deque<Integer> multiplyNumbers(Deque<Integer> num1, Deque<Integer> num2) {
        int n1 = convertDequeToNumber(num1);
        int n2 = convertDequeToNumber(num2);
        int product = n1 * n2;
        return convertNumberToDeque(product);
    }

    // Метод для сложения двух чисел
    public static Deque<Integer> addNumbers(Deque<Integer> num1, Deque<Integer> num2) {
        int n1 = convertDequeToNumber(num1);
        int n2 = convertDequeToNumber(num2);
        int sum = n1 + n2;
        return convertNumberToDeque(sum);
    }

    // Метод для преобразования числа в связанный список
    public static Deque<Integer> convertNumberToDeque(int number) {
        Deque<Integer> deque = new LinkedList< >();
        if (number == 0) {
            deque.add(0);
            return deque;
        }
        while (number > 0) {
            int digit = number % 10;
            deque.add(digit);
            number /= 10;
        }
        return deque;
    }

    // Метод для преобразования связанного списка в число
    public static int convertDequeToNumber(Deque<Integer> deque) {
        int number = 0;
        int power = 1;
        while (!deque.isEmpty()) {
            int digit = deque.removeFirst();
            number += digit * power;
            power *= 10;
        }
        return number;
    }
}


        
    

