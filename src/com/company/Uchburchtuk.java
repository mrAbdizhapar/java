package com.company;

import java.util.Scanner;

public class Uchburchtuk {

    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    void area(){
        double s = (a+b+c)/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }

}
