package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hola mundo");

        Calculator.showResult(Calculator.add(25, 25));

        Calculator.showResult(Calculator.multiply(5, 5));

        Calculator.showResult((Calculator.sub(6,4)));

        Calculator.showResult((Calculator.div(25, 5)));
    }

}
