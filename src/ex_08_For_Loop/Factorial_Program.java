package ex_08_For_Loop;

import java.util.Scanner;

public class Factorial_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number: ");
        int number = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }

    }
}


