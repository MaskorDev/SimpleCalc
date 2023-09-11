import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers separated by a space");
        String input = in.nextLine();
        String[] parts = input.split(" ");
        if (parts.length == 2) {
            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                System.out.println("Enter the operation sign\n*\t-\t+\t/\t%\t^");
                String sign = in.next();
                switch(sign) {
                    case "*":
                        System.out.println("The result of the calculation: " + (a * b));
                        break;
                    case "-":
                        System.out.println("The result of the calculation: " + (a - b));
                        break;
                    case "+":
                        System.out.println("The result of the calculation: " + (a + b));
                        break;
                    case "/":
                        System.out.println("The result of the calculation: " + (a / b));
                        break;
                    case "%":
                        System.out.println("The result of the calculation: " + (a % b));
                        break;
                    case "^":
                        System.out.println("The result of the calculation: " + Math.pow(a, b));
                        break;
                    default:
                        System.out.println("Choose one sign from suggested");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: enter two natural numbers");
            }
        } else {
            System.out.println("Error: enter two natural numbers separated by a space");
        }
    }
}