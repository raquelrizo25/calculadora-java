import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  System.out.println("=== CALCULADORA ===");

  System.out.print("Introduce el primer número: ");
    double num1 = sc.nextDouble();

  System.out.print("Introduce el segundo número: ");
    double num2 = sc.nextDouble();

  System.out.print("Elige operación (+, -, *, /): ");
    char operacion = sc.next().charAt(0);

  double resultado = 0;

  switch (operacion) {
    case '+':
      resultado = num1 + num2;
      break;
    case '-':
      resultado = num1 - num2;
      break;
    case '*':
      resultado = num1 * num2;
      break;
    case '/':
      if (num2 != 0) {
        resultado = num1 / num2;
      } else {
        System.out.println("Error: no se puede dividir entre 0");
        return;
      }
      break;
    default:
      System.out.println("Operación no válida");
      return;
  }
    System.out.println("Resultado: " + resultado);
  }
}
