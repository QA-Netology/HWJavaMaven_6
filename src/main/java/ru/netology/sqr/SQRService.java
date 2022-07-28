package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= max && i * i >= min) {
                count++;
            }
        }
        return count;
    }
}
