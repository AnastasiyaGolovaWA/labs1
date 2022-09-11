import com.example.labs1.Numbers;
import com.example.labs1.Operations;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTests extends Operations {

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

    @TestFactory
    Collection<DynamicTest> dynamicTestsForPlus() {
        return Arrays.asList(
                dynamicTest("Сумма десятичных чисел", () -> assertEquals(1, division(convert(1001, 111, 2)))),
                dynamicTest("Сумма двоичных чисел", () -> assertEquals(1, division(convert(1001, 111, 2)))),
                dynamicTest("Сумма восьмеричных чисел", () -> assertEquals(1, division(convert(1001, 111, 2)))),
                dynamicTest("Сумма шестнадцатеричных чисел", () -> assertEquals(1, division(convert(1001, 111, 2))))
        );
    }
}
