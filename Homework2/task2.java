import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.System.LoggerFinder;
import java.util.Scanner;

public class task2 {
    private static final System LogManager = null;
    private static final LoggerFinder logger = LogManager.getLogger(task2.class);

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Ввод первого числа
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            // Ввод операции
            System.out.print("Введите операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Ввод второго числа
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            // Вычисление результата
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    logger.error("Неверный оператор: {}", operator);
                    System.out.println("Ошибка: неверный оператор");
                    return;
            }

            // Вывод результата
            logger.info("{} {} {} = {}", num1, operator, num2, result);
            System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, result);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}