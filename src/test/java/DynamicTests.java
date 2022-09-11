import com.example.labs1.Numbers;
import com.example.labs1.Operations;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTests extends Operations {

    /*private DynamicTest buildTest(int num1, int num2, int system, int expected) {

        return dynamicTest("Сумма десятичных чисел", () -> {
            int actual = calculate(a, b, operator);
            assertEquals(actual, res);
        });
    }*/

    public static Numbers convert(int num1, int num2, int system) {
        Numbers numbers = new Numbers();
        if (system == 2) {
            numbers.setNum1(Numbers.toBinary(num1));
            numbers.setNum2(Numbers.toBinary(num2));
        }
        return numbers;
    }

    @TestFactory
    @CsvFileSource(resources = "/parameters.csv", numLinesToSkip = 1)
    Collection<DynamicTest> dynamicTestsFromCollection(int num1, int num2, int res) {
        return Arrays.asList(
                dynamicTest("Сумма десятичных чисел", () -> assertEquals(res, 4))
        );
    }
}
