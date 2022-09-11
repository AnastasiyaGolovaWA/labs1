package com.example.labs1;

import java.util.Scanner;

public class Calculator extends Operations {
    public static void main(String[] args) {
        final int num1;
        final int num2;
        final int ans;
        final char op;
        final int system;
        final Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextInt();
        System.out.print("Введите второе число: ");
        num2 = reader.nextInt();
        final Numbers numbers = new Numbers();
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        System.out.print("\nВ какой системе числения вы хотите работать (2, 8, 10, 16): ");
        system = reader.nextInt();

        System.out.print("\nВыберите действие (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch (op) {
            case '+':
                ans = plus(convert(num1, num2, system));
                break;
            case '-':
                ans = minus(convert(num1, num2, system));
                break;
            case '*':
                ans = multiplication(convert(num1, num2, system));
                break;
            case '/':
                ans = division(convert(num1, num2, system));
                break;
            default:
                System.out.printf("Ошибка! Введите корректный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(numbers.getNum1() + " " + op + " " + numbers.getNum2() + " = " + Integer.toString(ans, system));
    }
}