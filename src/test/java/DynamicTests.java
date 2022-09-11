import com.example.labs1.Numbers;
import com.example.labs1.Operations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    private void buildTestsFromFile(Collection<DynamicTest> tests, String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            in.readLine();

            String[] cells;
            int num1;
            int num2;
            int expectedSum;
            int system;

            int expectedValue;


            while ((line = in.readLine()) != null) {
                cells = line.split(",");
                num1 = Integer.parseInt(cells[0]);
                num2 = Integer.parseInt(cells[1]);

                expectedSum = Integer.parseInt(cells[2]);
                system = Integer.parseInt(cells[3]);

                tests.add(buildTest(num1, num2, Operations.Operation.ADD, expectedSum, system));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private DynamicTest buildTest(final int num1, final int num2, final Operation operator, final int expected, int system) {
        String displayName = String.format("%s %s %s = %s", num1, operator.SYMBOL, num2, expected);

        return dynamicTest(displayName, () -> {
            int res = Operations.calculate(convert(num1, num2, system), operator);
            assertEquals(expected, resFormat(res, system));
        });
    }

    public static int resFormat(int res, int system) {
        return Integer.parseInt(Integer.toString(res, system));
    }

    @DisplayName("динамический тест из всех *.csv в текущей папке")
    @TestFactory
    Collection<DynamicTest> runDynamicTest() {
        Collection<DynamicTest> tests = new ArrayList<>();

        Path currRelativePath = Paths.get("");
        String currFolder = currRelativePath.toAbsolutePath().toString();
        File folder = new File(currFolder);
        String[] folderContent = folder.list();

        for (String file : folderContent) {
            if (file.endsWith(".csv")) {
                buildTestsFromFile(tests, file);
            }
        }

        return tests;
    }
}
