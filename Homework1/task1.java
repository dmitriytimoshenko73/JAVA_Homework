//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int n = scanner.nextInt();

            // Вычисление n-го треугольного числа
            int triangleNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangleNumber += i;
            }
            System.out.printf("%d-ое треугольное число: %d%n", n, triangleNumber);

            // Вычисление факториала числа n
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.printf("%d! = %d%n", n, factorial);
        }
    }
}

    
    

