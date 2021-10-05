package com.company;

public class Validation {
    public void checkString(String[] masStringNumber) throws Throwable {
        if (masStringNumber.length != 3) {
            throw new Throwable("Вы ввели выражение некорректно");
        }
    }

    public void checkAfterZero(int ourResult) throws Throwable {
        if(ourResult <= 0){
            throw new Throwable("Ошибка. Результатом работы калькулятора с римскими числами могут быть только положительные числа");
        }
    }
}
