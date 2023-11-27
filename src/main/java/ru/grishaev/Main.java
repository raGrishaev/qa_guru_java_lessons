package ru.grishaev;

import java.util.Random;

public class Main {
        public static void main(String[] args) {
            mathOperation();
            System.out.println();
            logicOperation();
            System.out.println();
            stackOverflow();
            System.out.println();
            combinationNumber();
        }
        private static void mathOperation() {
            Random r = new Random();
            int a = r.nextInt(99)+1;
            int b = r.nextInt(99)+1;
            System.out.println("Сумма: a + b = " + (a + b));
            System.out.println("Разность: a - b = " + (a - b));
            System.out.println("Умножение: a * b = " + (a * b));
            System.out.println("Деление: a / b = " + (a / b));
            System.out.println("Остаток от деления: a % b = " + (a % b));
        }
        private static void logicOperation() {
            Random r = new Random();
            int a = r.nextInt(99)+1;
            int b = r.nextInt(99)+1;
            System.out.println("Равно: a == b = " + (a == b));
            System.out.println("Не равно: a != b = " + (a != b));
            System.out.println("Больше: a > b = " + (a > b));
            System.out.println("Меньше: a < b = " + (a < b));
            System.out.println("Больше или равно: b >= a = " + (b >= a));
            System.out.println("Меньше или равно: b <= a = " + (b <= a));

        }
        private static void stackOverflow() {
            long maxLong = Long.MAX_VALUE;
            long sum = maxLong + 1;
            short a = Short.MAX_VALUE;
            short b = Short.MAX_VALUE;
            short sumShort = (short) (a + b);

            System.out.println("Переполнение long: " + sum);
            System.out.println("Переполнение short: " + sumShort);
        }
        private static void combinationNumber() {
            Random r = new Random();
            int a = r.nextInt(99)+1;
            double b = r.nextDouble(99)+1;
            double sumDouble = a + b;
            double differenceDouble = a - b;
            double productDouble = a * b;
            double quotientDouble = a / b;

            int sumInt = (int) (a + b);
            int differenceInt = (int) (a - b);
            int productInt = (int) (a * b);
            int quotientInt = (int) (a / b);

            System.out.println("Сумма: " + sumDouble);
            System.out.println("Разность: " + differenceDouble);
            System.out.println("Умножение: " + productDouble);
            System.out.println("Деление: " + quotientDouble);
            System.out.println("Сумма: " + sumInt);
            System.out.println("Разность: " + differenceInt);
            System.out.println("Умножение: " + productInt);
            System.out.println("Деление: " + quotientInt);
        }
}