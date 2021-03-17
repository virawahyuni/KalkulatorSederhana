package Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        runCalculator();
    }
    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator(firstNumber, secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.plus());
        System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.divide());
        System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.minus());
        System.out.println(firstNumber + " x " + secondNumber + " = " + calculator.multiply());
        System.out.println(firstNumber + " % " + secondNumber + " = " + calculator.modulus());
    }
}