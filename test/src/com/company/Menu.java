package com.company;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import java.util.ArrayList;
import java.util.List;


public class Menu {

    private final String MENU_MESSAGE = "Ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir:";

    public void show(){
        System.out.println(MENU_MESSAGE);
    }

    public Integer readOption() {
        Scanner sc = new Scanner(System.in);
        // show();
        System.out.println("Ingrese un numero: ");
        Integer num = sc.nextInt();

        return num;
    }

    public String readOperator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un operador (+, -, *, /, =)");
        String operator = sc.nextLine();
        return operator;
    }

    public void chooseOperation(List<Integer> numbers){
        this.show();
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        this.processOperation(operation, numbers);
    }


    public void calc(List<Integer> numbers, List<String> operators){
        Integer result = numbers.get(0);
        List<Integer> numbersToSend = new ArrayList<Integer>();
        numbersToSend.add(numbers.remove(0));
        for (String operator : operators) {
            numbersToSend.add(numbers.remove(0));
            result = this.processOperation(operator, numbersToSend);
            numbersToSend.clear();
            numbersToSend.add(result);

        }
        Logger.log("El resultado es: " + result);
    }


    private Integer processOperation(String operation, List<Integer> numbers){

        Integer result = 0;
        Calculator calculator = new Calculator();
        switch(operation){
            case "+":
                result = calculator.add(numbers.toArray(new Integer[0]));
                break;
            case "-":
                result = calculator.sub(numbers.toArray(new Integer[0]));
                break;
            case "*":
                result = calculator.multiply(numbers.toArray(new Integer[0]));
                break;
            case "/":
                result = calculator.div(numbers.toArray(new Integer[0]));
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        return result;

    }

}
