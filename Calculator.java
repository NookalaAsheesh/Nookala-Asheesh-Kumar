public class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Error: Unsupported operation");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Calculator calc = new Calculator(10.5, 5.0, "add");
        calc.calculate();
    }
}