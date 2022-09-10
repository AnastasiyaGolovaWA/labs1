import com.example.labs1.Numbers;
import com.example.labs1.Operations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests extends Operations {
    Numbers numbers = new Numbers();

    @ParameterizedTest
    @CsvFileSource(resources = "/plusForBinary.csv", numLinesToSkip = 1)
    void plusForBinary(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toBinary(num1));
        numbers.setNum2(Numbers.toBinary(num2));
        int sum = plus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(sum, 2));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/plusForOctal.csv", numLinesToSkip = 1)
    void plusForOctal(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toOctalString(num1));
        numbers.setNum2(Numbers.toOctalString(num2));
        int sum = plus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(sum, 8));
        assertEquals(res, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/plusForHex.csv", numLinesToSkip = 1)
    void plusForHex(int num1, int num2, int res) {
        numbers.setNum1(Numbers.toHexString(num1));
        numbers.setNum2(Numbers.toHexString(num2));
        int sum = plus(numbers);
        int actualValue = Integer.parseInt(Integer.toString(sum, 16));
        assertEquals(res, actualValue);
    }
}