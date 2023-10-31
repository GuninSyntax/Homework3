package main_tasks;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" - FizzBuzz");
                System.out.println();
            } else if (i % 3 == 0) {
                System.out.print(" - fizz");
                System.out.println();
            } else if (i % 5 == 0) {
                System.out.print(" - buzz");
                System.out.println();
            } else System.out.println();
        }
    }
}