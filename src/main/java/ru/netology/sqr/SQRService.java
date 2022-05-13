package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int minValues, int maxValues) {

        int count = 0;
        for (int i = 10;i <= 99; i++) {
            if ((i * i) >= minValues && (i * i) <= maxValues) {
                count++;
            }
        }

        return count;
    }
}



