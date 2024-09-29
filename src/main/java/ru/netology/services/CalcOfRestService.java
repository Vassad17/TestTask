package ru.netology.services;

public class CalcOfRestService {
    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // остаток на счету
        for (int month = 0; month < 12; month++) {
            if (threshold >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses;
            } else {
                threshold = threshold + income;
            }
        }
        return count;
    }
}


