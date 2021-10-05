package com.company;

public class RimNumber {

    public static String[] rim = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private static int num1;
    private static int num2;

    public void checkRimNumber(String firstNumber, String secondNumber) throws Exception {
        int temp = 0;

        for (int i = 0; i < rim.length; i++) {
            if (rim[i].equals(firstNumber)) {
                num1 = i + 1;
                temp++;
            }
            if (rim[i].equals(secondNumber)) {
                num2 = i + 1;
                temp++;
            }
        }
        if (temp != 2) {
            throw new Exception("Ошибка. Калькулятор работатает только с арабскими или римскими цифрами одновременно ");
        }
    }

    public void show(int result) {
        if (result == 100) {
            System.out.println("C");
        } else {
            if (result >= 90) {
                try {
                    result = result - 90;
                    System.out.print("XC" + rim[result - 1]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("XC");
                }
            } else if (result >= 50) {
                System.out.print("L");
                while (result > 60) {
                    System.out.print("X");
                    result = result - 10;
                }
                result = result - 50;
                System.out.println(rim[result - 1]);
            } else if (result >= 40) {
                try {
                    result = result - 40;
                    System.out.print("XL" + rim[result - 1]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.print("XL");
                }
            } else {
                while (result > 10) {
                    System.out.print("X");
                    result = result - 10;
                }
                System.out.print(rim[result - 1]);
            }
        }
    }

    public int getFirstRimNumber() {
        return num1;
    }

    public int getSecondRimNumber() {
        return num2;
    }
}





