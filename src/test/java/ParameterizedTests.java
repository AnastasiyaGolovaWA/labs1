import com.example.labs1.Numbers;
import com.example.labs1.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParameterizedTests extends Operations {
    Numbers numbers = new Numbers();

    @ParameterizedTest
    @CsvFileSource(resources = "/plus/plusForBinary.csv", numLinesToSkip = 1)
    void plusForBinary(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toBinary(num1));
        numbers.setNum2(Numbers.toBinary(num2));
        int result = plus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 2));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/division/divisionForBinary.csv", numLinesToSkip = 1)
    void divisionForBinary(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toBinary(num1));
        numbers.setNum2(Numbers.toBinary(num2));
        int result = division(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 2));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/minus/minusForBinary.csv", numLinesToSkip = 1)
    void minusForBinary(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toBinary(num1));
        numbers.setNum2(Numbers.toBinary(num2));
        int result = minus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 2));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiplication/multiForBinary.csv", numLinesToSkip = 1)
    void multiForBinary(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toBinary(num1));
        numbers.setNum2(Numbers.toBinary(num2));
        int result = multiplication(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 2));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/plus/plusForOctal.csv", numLinesToSkip = 1)
    void plusForOctal(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toOctalString(num1));
        numbers.setNum2(Numbers.toOctalString(num2));
        int result = plus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 8));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/division/divisionForOctal.csv", numLinesToSkip = 1)
    void divisionForOctal(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toOctalString(num1));
        numbers.setNum2(Numbers.toOctalString(num2));
        int result = division(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 8));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/minus/minusForOctal.csv", numLinesToSkip = 1)
    void minusForOctal(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toOctalString(num1));
        numbers.setNum2(Numbers.toOctalString(num2));
        int result = minus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 8));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiplication/multiForOctal.csv", numLinesToSkip = 1)
    void multiForOctal(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toOctalString(num1));
        numbers.setNum2(Numbers.toOctalString(num2));
        int result = multiplication(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 8));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/plus/plusForHex.csv", numLinesToSkip = 1)
    void plusForHex(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toHexString(num1));
        numbers.setNum2(Numbers.toHexString(num2));
        int result = plus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 16));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/division/divisionForHex.csv", numLinesToSkip = 1)
    void divisionForHex(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toHexString(num1));
        numbers.setNum2(Numbers.toHexString(num2));
        int result = division(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 16));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/minus/minusForHex.csv", numLinesToSkip = 1)
    void minusForHex(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toHexString(num1));
        numbers.setNum2(Numbers.toHexString(num2));
        int result = minus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 16));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiplication/multiForHex.csv", numLinesToSkip = 1)
    void multiForHex(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toHexString(num1));
        numbers.setNum2(Numbers.toHexString(num2));
        int result = multiplication(numbers);
        int actualValue = Integer.parseInt(Integer.toString(result, 16));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/plus/plusForDecimal.csv", numLinesToSkip = 1)
    void plusForDecimal(int num1, int num2, int res) {
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        int actualValue = plus(numbers);
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/division/divisionForDecimal.csv", numLinesToSkip = 1)
    void divisionForDecimal(int num1, int num2, int res) {
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        int actualValue = division(numbers);
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/minus/minusForDecimal.csv", numLinesToSkip = 1)
    void minusForDecimal(int num1, int num2, int res) {
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        int actualValue = minus(numbers);
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiplication/multiForDecimal.csv", numLinesToSkip = 1)
    void multiForDecimal(int num1, int num2, int res) {
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        int actualValue = multiplication(numbers);
        assertEquals(res, actualValue);
    }
}