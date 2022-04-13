package com.company;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu();
        // menu.readOption();

        Integer stop = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        List<String> operators = new ArrayList<String>();
        while (stop != 1){
            Integer num = menu.readOption();
            String operator = menu.readOperator();
            if (operator == "="){
                stop = 1;
                menu.calc(numbers, operators);
                System.out.println("Entra aca");
                // menu.chooseOperation(numbers);
                // System.out.println(numbers);
            }
            numbers.add(num);
            operators.add(operator);
        } 

    }
}
