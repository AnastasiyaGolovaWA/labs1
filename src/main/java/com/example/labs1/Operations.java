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
