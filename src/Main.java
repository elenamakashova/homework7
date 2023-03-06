import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month++;
            total = total + money;
            System.out.println ("Месяц " + month + ": сумма накоплений равна " + total + " рублей");
        }
        System.out.println ();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print (start + " ");
            start++;
        }
        System.out.println ();
        for (int i = 10; i >= 1; i--) {
            System.out.print (i + " ");
        }
        System.out.println ();
        System.out.println ();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12000000;
        int bithPerYear = 17;
        int mortalityPerYear = 8;
        int populationGrowth = bithPerYear - mortalityPerYear;
        for (int i = 1; i <= 10; i++) {
            population = population + ((population / 1000) * populationGrowth);
            System.out.println ("Год " + i + ": численность населения составляет " + population);
        }
        System.out.println ();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int money = 15000;
        double total = 0;
        int i = 1;
        for (; total <= 12000000; i++) {
            total = total + total * 0.07;
            total = total + money;
            System.out.println ("Месяц " + i + ": сумма накоплений составляет " + total);
        }
        System.out.println ("Для того, чтобы накопить 12 млн рублей, потребуется " + i + " месяц");
        System.out.println ();
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int money = 15000;
        double total = 0;
        int i = 1;
        for (; total <= 12000000; i++) {
            total = total + total * 0.07;
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ": сумма накоплений составляет " + total);
            }
        }
            System.out.println ("Для того, чтобы накопить 12 млн рублей, потребуется " + i + " месяц");
        System.out.println ();
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int money = 15000;
        double total = 0;
        int i = 1;
        for (; i <= 108; i++) {
            total = total + total * 0.07;
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ": сумма накоплений составляет " + total);
            }
        }
        System.out.println ("Количество месяцев: " + i);
        System.out.println ();
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int date = 3;
        for (int i = date; i <= 31; i = i + 7) {
            System.out.println ("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println ();
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        for (int i = year; i <= 2123; i = i + 79) {
            if (i >= 1823) {
                System.out.println("Год появления кометы: " + i);
            }
        }
    }
}