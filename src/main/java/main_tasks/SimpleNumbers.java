package main_tasks;

public class SimpleNumbers {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && j < i) {
                    break;
                } else if (i % j == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}