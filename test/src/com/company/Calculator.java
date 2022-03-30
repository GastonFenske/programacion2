package com.company;

public class Calculator {

    public static void showResult(int result){
        String resultString = String.valueOf(result);
        System.out.println("El resultado es: ".concat(resultString));

    }

    public static Integer add(int num, int num2){
        Integer result = num + num2;
        return result;
    }

    public static Integer multiply(int num, int num2){
        Integer result = num * num2;
        return result;
    }

    public static Integer sub(int num, int num2){
        Integer result = num - num2;
        return result;
    }

    public static Integer div(int num, int num2){
        Integer result = 0;
        if (num2 != 0){
           result = num / num2;
        }
        return result;
    }
}
