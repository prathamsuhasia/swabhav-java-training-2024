package Calculatorpckg;
public class CalculatorTest {

    int a = 20;
    int b = 10;
    int c;
    
    void addition() {
        c = a + b;
        System.out.println("Addition is " + c);
    }

    void subtraction() {
        c = a - b;
        System.out.println("Subtraction is " + c);
    }

    void multiplication() {
        c = a * b;
        System.out.println("Multiplication is " + c);
    }

    void division() {
        c = a / b;
        System.out.println("Division is " + c);
    }

    public static void main(String[] args) {
        CalculatorTest calculator = new CalculatorTest();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
    }
}
