package com.example.labs1;

import java.util.Scanner;

public class Calculator extends Operations {
    public static void main(String[] args) {
        final int num1;
        final int num2;
        final int ans;
        final char op;
        final int number;
        final Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextInt();
        System.out.print("Введите второе число: ");
        num2 = reader.nextInt();
        final Numbers numbers = new Numbers();
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        System.out.print("\nВ какой системе числения вы хотите работать (2, 8, 10, 16): ");
        number = reader.nextInt();

        switch (number) {
            case 2:
                System.out.println("Двоичная система счисления");
                numbers.setNum1(Numbers.toBinary(numbers.getNum1()));
                numbers.setNum2(Numbers.toBinary(numbers.getNum2()));
                break;
            case 8:
                System.out.println("Восьмеричная система счисления");
                numbers.setNum1(Numbers.toOctalString(numbers.getNum1()));
                numbers.setNum2(Numbers.toOctalString(numbers.getNum2()));
                break;
            case 10:
                System.out.println("Десятичная система счисления");
                break;
            case 16:
                System.out.println("Шестнадцатиричная система счисления");
                numbers.setNum1(Numbers.toHexString(numbers.getNum1()));
                numbers.setNum2(Numbers.toHexString(numbers.getNum2()));
                break;
            default:
                System.out.printf("Ошибка! Введите поддерживаемую систему счисления");
                return;
        }

        System.out.print("\nВыберите действие (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch (op) {
            case '+':
                ans = plus(numbers);
                break;
            case '-':
                ans = minus(numbers);
                break;
            case '*':
                ans = multiplication(numbers);
                break;
            case '/':
                ans = division(numbers);
                break;
            default:
                System.out.printf("Ошибка! Введите корректный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(Integer.toString(numbers.getNum1(), number) + " " + op + " " + Integer.toString(numbers.getNum2(), number) + " = " + Integer.toString(ans, number));
    }
}