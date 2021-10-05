package com.company;

public class ArabicNumber {
    public int getNumber(String number) {
        return Integer.parseInt(number);
    }

    public boolean checkArabicNumber(int firstNumber, int secondNumber) {
        return firstNumber >= 1 && firstNumber <= 10 && secondNumber >= 1 && secondNumber <= 10; //тернарный условный
    }
}
