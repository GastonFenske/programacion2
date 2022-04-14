package com.company;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu();

        List<Integer> numbers = new ArrayList<Integer>();
        List<String> operators = new ArrayList<String>();
        while (true){
            Integer num = menu.readOption();
            String operator = menu.readOperator();
            numbers.add(num);
            if (operator.equals("=")){
                menu.calc(numbers, operators);
                break;
            }
            operators.add(operator);
        } 
    }
}
