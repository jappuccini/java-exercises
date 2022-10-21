import java.util.Scanner;

public class Exercise {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    System.out.print("Gib bitte den ersten Operanden ein: ");
    double operand1 = sc.nextDouble();

    System.out.print("Gib bitte den Operator ein: ");
    char operator = sc.next().charAt(0);

    System.out.print("Gib bitte den zweiten Operanden ein: ");
    double operand2 = sc.nextDouble();

    double result = 0;

    switch (operator) {
      case '+':
        result = operand1 + operand2;
        break;
      case '-':
        result = operand1 - operand2;
        break;
      case '*':
        result = operand1 * operand2;
        break;
      case '/':
        result = operand1 / operand2;
        break;
      default:
        break;
    }

    // Anstatt switch kann auch eine verschachtelte if else verwendet werden
    //
    // if (operator == '+') {
    // result = operand1 + operand2;
    // } else if (operator == '-') {
    // result = operand1 - operand2;
    // } else if (operator == '*') {
    // result = operand1 * operand2;
    // } else if (operator == '/') {
    // result = operand1 / operand2;
    // }

    System.out.printf("Ergebnis: %.2f %c %.2f = %.2f", operand1, operator, operand2, result);
  }
}
