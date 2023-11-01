package main_tasks;

public class SimpleNumbers {

    static void simpleNumber(int number) {
        if (number == 1) {
            System.out.println(number + " не является простым или составным числом");
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i < number) {
                System.out.println(number + " это не простое число, а составное");
                return;
            } else if (number % i == 0) {
                System.out.println(number + " это простое число");
            }
        }
    }

    public static void main(String[] args) {
        int number = 11;
        simpleNumber(number);
    }
}