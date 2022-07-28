package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void testCountRange(int expected, int max, int min) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(max, min);

        Assertions.assertEquals(expected, actual);
    }
}
