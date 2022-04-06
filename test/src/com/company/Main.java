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
        while (stop != 1){
            Integer num = menu.readOption();
            if (num == 0){
                stop = 1;
                menu.chooseOperation(numbers);
                // System.out.println(numbers);
            }
            numbers.add(num);
        } 

    }
}
