package com.company;
import java.lang.invoke.CallSite;
import java.util.Scanner;

public class Menu {

    private final String MENU_MESSAGE = "Ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir:";

    public void show(){
        System.out.println(MENU_MESSAGE);
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        show();
        Integer option = sc.nextInt();

        System.out.println("Ingrese el primer numero: ");
        Integer num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        Integer num2 = sc.nextInt();

        this.processOption(option, num, num2);
            
    }

        private void processOption(Integer option, Integer num, Integer num2){

            Calculator calculator = new Calculator();
            switch(option){
                case 1:
                    Logger.log("El resultado es: " + calculator.add(num, num2));
                    break;
                case 2:
                    Logger.log("El resultado es: " + calculator.sub(num, num2)); 
                    break;
                case 3:
                    Logger.log("El resultado es: " + calculator.multiply(num, num2)); 
                    break;
                case 4:
                    Logger.log("El resultado es: " + calculator.div(num, num2)); 
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }


}
