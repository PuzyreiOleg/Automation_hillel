package com.company;

public class Main {

    public static void main(String[] args) {
	Calc calc = new Calc();
        System.out.println(calc.sum(1,4));
        System.out.println(calc.sub(1,4));
        System.out.println(calc.mult(1,4));
        System.out.println(calc.div(10,2));
    }
    // перешрузка статического метода? - можно
}
