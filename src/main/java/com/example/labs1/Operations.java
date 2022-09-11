package com.example.labs1;

public class Operations {
    public static int plus(Numbers numbers) {
        int res = numbers.getNum1() + numbers.getNum2();
        return res;
    }

    public static int minus(Numbers numbers) {
        int res = numbers.getNum1() - numbers.getNum2();
        return res;
    }

    public static int multiplication(Numbers numbers) {
        int res = numbers.getNum1() * numbers.getNum2();
        return res;
    }

    public static int division(Numbers numbers) {
        int res = numbers.getNum1() / numbers.getNum2();
        return res;
    }

    public static Numbers convert(int num1, int num2, int system) {
        Numbers numbers = new Numbers();
        if (system == 2) {
            numbers.setNum1(Numbers.toBinary(num1));
            numbers.setNum2(Numbers.toBinary(num2));
        }
        if (system == 8) {
            numbers.setNum1(Numbers.toOctalString(num1));
            numbers.setNum2(Numbers.toOctalString(num2));
        }
        if (system == 16) {
            numbers.setNum1(Numbers.toHexString(num1));
            numbers.setNum2(Numbers.toHexString(num2));
        }
        if (system == 10) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
        }
        return numbers;
    }

    public static int calculate(Numbers numbers, Operation operation) {
        int result = 0;

        switch (operation) {
            case ADD:
                result = Calculator.plus(numbers);
                break;
            case SUBTRACT:
                result = Calculator.minus(numbers);
                break;
            case MULTIPLY:
                result = Calculator.multiplication(numbers);
                break;
            case DIVIDE:
                result = Calculator.division(numbers);
                break;
        }

        return result;
    }

    public enum Operation {

        ADD("+"),
        SUBTRACT("-"),
        MULTIPLY("*"),
        DIVIDE("/");

        public final String SYMBOL;

        Operation(String symbol) {
            this.SYMBOL = symbol;
        }

        @Override
        public String toString() {
            return SYMBOL;
        }
    }
}
