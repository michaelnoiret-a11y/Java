import java.util.Scanner;

class HelloWorld {

    String name;

    public void static main(String[] args) {
        HelloWorld User = new User("");
        Scanner scanner = new Scanner(System.in);
        scanner = scanner.nextLine();
        System.out.println("Please write your name: " + scanner);
        System.out.println("Hello, " + name);
    }
}