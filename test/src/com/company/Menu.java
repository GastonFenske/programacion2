package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final String MENU_MESSAGE_OP = "Ingrese un operador (+, -, *, /, =): ";
    private final String MENU_MESSAGE_NUMBERS = "Ingrese un numero: ";
    private final String MENU_MESSAGE_ERROR = "No es posible divir por cero, se mostrara el resultado hasta donde fue posible \n";

    public void show(String message){
        System.out.print(message);
    }

    public Integer readOption() {
        Scanner sc = new Scanner(System.in);
        this.show(MENU_MESSAGE_NUMBERS);
        Integer num = sc.nextInt();
        return num;
    }

    public String readOperator() {
        Scanner sc = new Scanner(System.in);
        this.show(MENU_MESSAGE_OP);
        String operator = sc.nextLine();
        return operator;
    }

    public void calc(List<Integer> numbers, List<String> operators){
        Integer result = numbers.get(0);
        List<Integer> numbersToSend = new ArrayList<Integer>();
        numbersToSend.add(numbers.remove(0));
        for (String operator : operators) {
            Integer getNumber = numbers.remove(0);
            if (getNumber == 0) {
                this.show(MENU_MESSAGE_ERROR);
                break;
            }
            numbersToSend.add(getNumber);
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
