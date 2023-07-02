// Реализовать стэк с помощью массива. Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

package Homework4;

public class task2 {
    public static void main(String[] args) {
        class Stack {
            private int maxSize; // максимальный размер стека
            private int[] stackArray; // массив, представляющий стек
            private int top; // индекс вершины стека

            public Stack(int size) {
                maxSize = size;
                stackArray = new int[maxSize];
                top = -1; // стек пустой
            }

            public boolean isEmpty() {
                return (top == -1);
            }

            public boolean isFull() {
                return (top == maxSize - 1);
            }

            public void push(int value) {
                if (isFull()) {
                    System.out.println("Стек полон. Невозможно добавить элемент.");
                    return;
                }
                stackArray[++top] = value;
            }

            public int pop() {
                if (isEmpty()) {
                    System.out.println("Стек пуст. Невозможно удалить элемент.");
                    return -1;
                }
                return stackArray[top--];
            }

            public int peek() {
                if (isEmpty()) {
                    System.out.println("Стек пуст. Нет элементов для просмотра.");
                    return -1;
                }
                return stackArray[top];
            }

            public int size() {
                return top + 1;
            }

            public static void main(String[] args) {
                Stack stack = new Stack(5);
                stack.push(1);
            }
        }
    }

}
