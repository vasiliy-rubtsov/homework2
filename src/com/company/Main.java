package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = "+ paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = "+ paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = "+ paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        var weightDiff = boxerWeight2 - boxerWeight1;
        System.out.println("Общая масса боксеров " + totalWeight + " кг. Второй боксер тяжелее первого на " + weightDiff +" кг");

        // Задача 7
        System.out.println("Задача 7");
        System.out.println(boxerWeight2 % boxerWeight1);

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkHours = 640;
        var workDayHours = 8;
        var numberOfEmployees = totalWorkHours / workDayHours;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        var totalWorkHoursNew = numberOfEmployees * workDayHours;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + totalWorkHoursNew + " часов работы может быть поделено между сотрудниками");

    }
}
