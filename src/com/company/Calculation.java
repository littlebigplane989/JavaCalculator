package com.company;

public class Calculation {
    public int calculate(int firstNumber, int secondNumber, String signString) {
        int result = 0;
        switch (signString) {
            case ("+"):
                result = firstNumber + secondNumber;
                break;
            case ("-"):
                result = firstNumber - secondNumber;
                break;
            case ("*"):
                result = firstNumber * secondNumber;
                break;
            case ("/"):
                result = firstNumber / secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Вы ввели некорректный знак!");
        }
        return result;
    }
}
