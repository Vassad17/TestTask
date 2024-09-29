package ru.netology.services;

public class CalcOfRestService {
    public int calculate(int income, int expenses, int balance) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // остаток на счету
        for (int month = 0; month < 12; month++) {
            if (threshold >= balance) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = (threshold - expenses) / 3;
            } else {
                threshold = threshold - expenses + income;
            }
        }
        return count;
    }
}


