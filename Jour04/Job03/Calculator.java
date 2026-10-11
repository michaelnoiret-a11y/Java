import java.util.Scanner;

class Calculator {

    Integer num1;
    Integer num2;

    public Integer Sum(int num1, int num2) {
        Scanner scanner = new Scanner;
        scanner.NextInt();
        scanner.NextInt();
        int sum = num1 + num2;
    }

    public Integer Diff(int num1, int num2) {
        Scanner scanner = new Scanner;
        scanner.NextInt();
        scanner.NextInt();
        int diff = num1 - num2;
    }

    public Integer Prod(int num1, int num2) {
    Scanner scanner = new Scanner;
        scanner.NextInt();
        scanner.NextInt();
        int prod = num1 * num2;
    }

    public Integer Div(int num1, int num2) {
    Scanner scanner = new Scanner;
        scanner.NextInt();
        scanner.NextInt();
        int div = num1 / num2;
    }


    public static void main(String[] args)
    
    System.out.println("Enter first number: " + num1)
    System.out.println("Enter second number: " + num2)
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + diff);
    System.out.println("Product: " + prod);
    System.out.println("Division: " + div);
}