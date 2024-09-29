package ru.netology.javaqa;

import ru.netology.services.CalcOfRestService;

public class Main {

    public static void main(String[] args) {
        CalcOfRestService calcOfRestService = new CalcOfRestService();

        int count = calcOfRestService.calculate(10_000, 3_000, 20000);
        System.out.println(count);
    }

}