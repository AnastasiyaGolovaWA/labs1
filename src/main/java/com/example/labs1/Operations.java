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
}
