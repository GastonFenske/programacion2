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
        // Integer option = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        Integer num = sc.nextInt();
        // System.out.println("Ingrese el segundo numero: ");
        // Integer num2 = sc.nextInt();

        // this.processOption(option, num, num2);
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
        // this.readOption();
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        this.processOperation(operation, numbers);
    }

// 	static void display(Integer... values){  
//         for(Integer value:values){  
//          System.out.println(value);  
//         }  
//    }  

    public void calc(List<Integer> numbers, List<String> operators){
        Integer pointer = 0; 
        Integer result = 0;
        List<Integer> numbersToSend = new ArrayList<Integer>();
        numbersToSend.add(numbers.get(0));
        numbersToSend.add(numbers.get(1));
        for (Integer num : numbers){
            result = this.processOperation(operators.get(pointer), numbersToSend);
            pointer = pointer + 1;
            numbersToSend.clear();
            numbersToSend.add(result);
            numbersToSend.add(num);
        }
        Logger.log("El resultado es: " + result);
    }

//    List<Integer> numbers = new ArrayList<Integer>();

    private Integer processOperation(String operation, List<Integer> numbers){

        Integer result = 0;
        Calculator calculator = new Calculator();
        switch(operation){
            case "+":
                // Logger.log("El resultado es: " + calculator.add(numbers.toArray(new Integer[0])));
                result = calculator.add(numbers.toArray(new Integer[0]));
                break;
            // case "-":
            //     Logger.log("El resultado es: " + calculator.sub(numbers.toArray(new Integer[0])));
            //     break;
            // case "*":
            //     Logger.log("El resultado es: " + calculator.multiply(numbers.toArray(new Integer[0])));
            //     break;
            // case "/":
            //     Logger.log("El resultado es: " + calculator.div(numbers.toArray(new Integer[0]))); 
            //     break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        return result;

    }

}
