package com.company;
import java.util.Scanner;
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

    public void chooseOperation(List<Integer> numbers){
        this.show();
        // this.readOption();
        Scanner sc = new Scanner(System.in);
        Integer operation = sc.nextInt();
        this.processOperation(operation, numbers);
    }

// 	static void display(Integer... values){  
//         for(Integer value:values){  
//          System.out.println(value);  
//         }  
//    }  

//    List<Integer> numbers = new ArrayList<Integer>();

    private void processOperation(Integer operation, List<Integer> numbers){

        Calculator calculator = new Calculator();
        switch(operation){
            case 1:
                // calculator.add2(numbers.toArray(new Integer[0]))
                Logger.log("El resultado es: " + calculator.add(numbers.toArray(new Integer[0])));
                // Logger.log("El resultado es: " + calculator.add(num, num2));
                break;
            case 2:
                Logger.log("El resultado es: " + calculator.sub(numbers.toArray(new Integer[0])));
                break;
            case 3:
                Logger.log("El resultado es: " + calculator.multiply(numbers.toArray(new Integer[0])));
                break;
            case 4:
                Logger.log("El resultado es: " + calculator.div(numbers.toArray(new Integer[0]))); 
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }


}
