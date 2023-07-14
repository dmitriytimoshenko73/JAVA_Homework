package Homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Laptop(String brand, int ram, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    // Геттеры и сеттеры для полей класса

    public static void main(String[] args) {
    // Создание множества ноутбуков
    Set<Laptop> laptops = new HashSet<>();
    laptops.add(new Laptop("Apple",8,256,"macOS","Серый"));
    laptops.add(new Laptop("HP",16,512,"Windows","Черный"));
    laptops.add(new Laptop("Dell",8,512,"Windows","Серебристый"));
    laptops.add(new Laptop("Lenovo",12,256,"Windows","Синий"));
    laptops.add(new Laptop("Apple",16,512,"macOS","Золотой"));

    // Вызов метода для фильтрации ноутбуков
    Map<Integer, Object> filters = getFiltersFromUser();
    Set<Laptop> filteredLaptops = filterLaptops(laptops, filters);

    // Вывод отфильтрованных ноутбуков
    System.out.println("Ноутбуки, отвечающие фильтру:");
       for(Laptop laptop : filteredLaptops)
    {
        System.out.println(laptop);
    }
}

    public static Map<Integer, Object> getFiltersFromUser() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filters = new HashMap<>();

        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteria = scanner.nextInt();
        scanner.nextLine(); // Пропустить символ новой строки

        switch (criteria) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                filters.put(criteria, minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minStorage = scanner.nextInt();
                filters.put(criteria, minStorage);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.nextLine();
                filters.put(criteria, os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filters.put(criteria, color);
                break;
            default:
                System.out.println("Неверный критерий фильтрации.");
        }

        return filters;
    }

    public static Set<Laptop>1 filterLaptops(Set<Laptop> laptops, Map<Integer, Object> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean isValid = true;

            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int criteria = entry.getKey();
                Object value = entry.getValue();

                switch (criteria) {
                    case 1:
                        if (laptop.getRam() < (int) value) {
                            isValid = false;
                        }
                        break;
                    case 2:
                        if (laptop.getStorage() < (int) value) {
                            isValid = false;
                        }
                        break;
                    case 3:
                        if (!laptop.getOperatingSystem().equals(value)) {
                            isValid = false;
                        }
                        break;
                    case 4:
                        if (!laptop.getColor().equals(value)) {
                            isValid = false;
                        }
                        break;
                    default:
                        isValid = false;
                        break;
                }

                if (!isValid) {
                    break; // Прекратить проверку остальных критериев, если текущий критерий не прошел
                }
            }

            if (isValid) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }

    // Переопределение метода toString() для вывода информации о ноутбуке
    // @Override
    public String toString() {
        return "Ноутбук [Бренд: " + brand + ", ОЗУ: " + ram + " ГБ, Объем ЖД: " + storage + " ГБ, ОС: " +
                operatingSystem + ", Цвет: " + color + "]";
    }

    // Геттеры и сеттеры для полей класса

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

