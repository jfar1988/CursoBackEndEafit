import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1;
        double num2;

        do {
            System.out.println("¡Bienvenido! \n");
            System.out.println("Calculadora");
            System.out.println("A continuacion eliga una de las siguientes operaciones: ");
            System.out.println("0. Salir");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("La opcion que elejiste es: ");
            opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("Gracias por usar la calculadora");
                System.out.println("Hasta pronto...");
                break;
            }

            System.out.println("Ingresa el primer valor: ");
            num1 = scanner.nextDouble();
            System.out.println("Ingresa el segundo valor: ");
            num2 = scanner.nextDouble();
            Operation operation = null;
            switch (opcion) {
                case 1:
                    operation = new Add(num1, num2);
                    break;
                case 2:
                    operation = new Subtraction(num1, num2);
                    break;
                case 3:
                    operation = new Multiplication(num1, num2);
                    break;
                case 4:
                    operation = new Division(num1, num2);
                    break;
            }
            System.out.println("El resultado es: " + operation.calculate());

        } while (opcion != 0);
        scanner.close();
    }

}
