package com.company;

public class Calculator {

    /*
    public static void showResult(int result){
        String resultString = String.valueOf(result);
        System.out.println("El resultado es: ".concat(resultString));

    }
     */

    public Integer add(Integer... numbers){
        Integer result = 0;
        for (Integer num : numbers){
            result = result + num;
        }
        return result;
    }

    public Integer multiply(Integer... numbers){
        Integer result = 1;
        for (Integer num : numbers){
            result = result * num;
        }
        return result;
    }

    public Integer sub(Integer... numbers){
        Integer result = numbers[0];
        for (Integer num : numbers){
            if (num != numbers[0]){
                result = result - num;
            }
        }
        return result;
    }

    public Integer div(Integer... numbers){
        Integer result = numbers[0];
        for (Integer num : numbers){
            if (num != numbers[0]){
                result = result / num;
            }
        }
        return result;
    }
}
