/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab.java;

import java.util.Scanner;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class MethodslabJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        greetUser();

        System.out.println("\n BASIC CALCULATOR ");

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));

        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Division is not possible.");
        }

        System.out.println("\n FACTORIAL ");

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number >= 0) {
            System.out.println("Factorial: " + factorial(number));
        } else {
            System.out.println("Invalid number.");
        }

        System.out.println("\n ARRAY SUM ");

        int[] numbers = {12, 20, 15, 18, 10};

        System.out.println("Array Sum: " + sumArray(numbers));

        System.out.println("\n PRIME CHECKER ");

        System.out.print("Enter number to check: ");
        int prime = input.nextInt();

        if (isPrime(prime)) {
            System.out.println(prime + " is a prime number.");
        } else {
            System.out.println(prime + " is not a prime number.");
        }

        System.out.println("\n MAXIMUM VALUE ");

        int[] values = {30, 45, 10, 60, 25};

        System.out.println("Largest number: " + maxInArray(values));

        System.out.println("\n GCD AND LCM ");

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));

        System.out.println("\nProgram Finished.");

    }

    public static void greetUser() {
        System.out.println("Hello! Welcome to the Java Methods Program.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static long factorial(int n) {

        long answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
        }

        return answer;
    }

    public static int sumArray(int[] array) {

        int total = 0;

        for (int value : array) {
            total += value;
        }

        return total;
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int maxInArray(int[] array) {

        int largest = array[0];

        for (int value : array) {

            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    public static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {

        return (a / gcd(a, b)) * b;
    }
}
