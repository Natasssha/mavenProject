package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "199,299,3",
            "201,301,3",
            "99,99,0",
            "1,350,9",
            "0, 99, 0",
           
    })

    public void test(int minValues, int maxValues, int expected) {
        SQRService service = new SQRService();
        int actual = service.numberOfSquares(minValues, maxValues);

        Assertions.assertEquals(expected, actual);
    }
}

