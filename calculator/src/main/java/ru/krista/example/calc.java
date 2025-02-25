package ru.krista.example;

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