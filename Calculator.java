package Calculator;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public int plus() {
        return this.firstNumber + this.secondNumber;
    }
    public int divide() {
        return this.firstNumber / this.secondNumber;
    }
    public int minus() {
        return this.firstNumber - this.secondNumber;
    }
    public int multiply() {
        return this.firstNumber * this.secondNumber;
    }
    public int modulus() {
        return this.firstNumber % this.secondNumber;
    }
}