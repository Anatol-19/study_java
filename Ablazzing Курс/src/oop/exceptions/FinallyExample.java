package oop.exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("ОшибкЭ!!");
        } finally {
            System.out.println("Какие то действия после");
        }

    }
}
