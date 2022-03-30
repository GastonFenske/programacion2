package com.company;

public class Calculator {

    /*
    public static void showResult(int result){
        String resultString = String.valueOf(result);
        System.out.println("El resultado es: ".concat(resultString));

    }
     */

    public Integer add(Integer num, Integer num2){
        Integer result = num + num2;
        return result;
    }

    public Integer multiply(Integer num, Integer num2){
        Integer result = num * num2;
        return result;
    }

    public Integer sub(Integer num, Integer num2){
        Integer result = num - num2;
        return result;
    }

    public Integer div(Integer num, Integer num2){
        Integer result = 0;
        if (num2 != 0){
           result = num / num2;
        }
        return result;
    }
}
