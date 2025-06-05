import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dividend: ");
        double a = sc.nextDouble();
        System.out.print("Divisor: ");
        double b = sc.nextDouble();

        System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero.");
        sc.close();
    }
}
