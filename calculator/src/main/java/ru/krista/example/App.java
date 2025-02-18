package ru.krista.example;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String symb = in.next();
        int y = in.nextInt();
        System.out.println(String.format("X=%d %1.1s Y=%d = ", x, symb, y));
    }
}
