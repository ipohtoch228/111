package ru.krista.example;
import java.util.Scanner;

public final class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String symb = in.next();
        int y = in.nextInt();
        switch (symb) {
            case ("+"):
            System.out.println(calc.summ(x,y)); 
            break;

            case ("-"):
            System.out.println(calc.dif(x,y)); 
            break;

            case ("*"):
            System.out.println(calc.mult(x,y)); 
            break;

            case ("/"):
            System.out.println(calc.div(x,y)); 
            break;

            default:
            System.out.println("неизвестный знак операции");
        }
    }
}

public class calc {
    public static int summ (int num1, int num2){
        return num1+num2;
    }
    public static int dif (int num1, int num2){
        return num1-num2;
    }
    public static int mult (int num1, int num2){
        return num1*num2;
    }
    public static int div (int num1, int num2){
        if (num2==0) {
            System.out.println("нельзя так делать");
            return 0;
        } 
        else {
            return num1/num2;
        }
    }
}