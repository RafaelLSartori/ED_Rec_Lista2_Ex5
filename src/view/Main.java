package view;
import controller.Ex5;

public class Main {
    public static void main(String[] args) {

        Ex5 m = new Ex5();
        int num1 = 24;
        int num2 = 20;
        int resp = m.mdc(num1, num2);
        System.out.print(resp);
    }
}