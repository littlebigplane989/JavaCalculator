package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ваше выражения используя числа от 0 до 10 или от I до X:");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        String masStringNumber[] = operation.split(" ");
        Validation validation = new Validation();
        ArabicNumber arabicNumber = new ArabicNumber();
        RimNumber rimNumber = new RimNumber();
        Calculation calculation = new Calculation();


        try {
            validation.checkString(masStringNumber);
            String first = masStringNumber[0];
            String second = masStringNumber[2];
            String signString = masStringNumber[1];
            try {
                int firstNumber = arabicNumber.getNumber(first);
                int secondNumber = arabicNumber.getNumber(second);

                if (arabicNumber.checkArabicNumber(firstNumber, secondNumber)) {
                    int ourResult = calculation.calculate(firstNumber, secondNumber, signString);
                    System.out.println(ourResult);
                } else {
                    throw new Exception("Вы ввели некоректное выражение. Числа должны быть от 0 до 10");
                }

            } catch (NumberFormatException e) {
                rimNumber.checkRimNumber(first, second);
                int firstRimNumber = rimNumber.getFirstRimNumber();
                int secondRimNumber = rimNumber.getSecondRimNumber();
                int ourResult = calculation.calculate(firstRimNumber,secondRimNumber,signString);
                validation.checkAfterZero(ourResult);
                rimNumber.show(ourResult);
                System.out.println();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch (Throwable t) {
            t.printStackTrace();
        }

    }
}