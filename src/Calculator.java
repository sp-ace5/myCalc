public class Calculator {
    private double operandOne;
    private double operandTwo;
    private char operator;


    public void setOperandOne(double operand) {
        operandOne = operand;
    }

    public void setOperandTwo(double operand) {
        operandTwo = operand;
    }

    public void setOperation(char operation) {
        operator = operation;
    }

    public void performOperation() {
        switch (operator) {
            case '+', '-' -> {
            }
            default -> {
                System.out.println("error - performOperation");
            }
        }
    }

    public double getResults() {
        double result = 0.0;
        switch (operator) {
            case '+' -> result = operandOne + operandTwo;
            case '-' -> result = operandOne - operandTwo;
            default -> System.out.println("error - getResults");
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setOperandOne(10.5);
        calc.setOperation('+');
        calc.setOperandTwo(5.2);
        calc.performOperation();
        double result = calc.getResults();

        System.out.println("Result: " + result); // Output should be 15.7
    }
}
