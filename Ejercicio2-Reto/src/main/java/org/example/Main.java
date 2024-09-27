package org.example;


import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero1, numero2;
        Operacion operacion = null;
        String tipoOperacion = "";


        try{
            System.out.println("Leyendo el numero en el archivo...");
            LeerArchivo leer = new LeerArchivo();

            System.out.println("Número leído del archivo: " + leer.getArchivo("src/main/resources/numero.txt"));


            System.out.print("Ingresa el primer número: ");
            numero1 = scan.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            numero2 = scan.nextDouble();

            System.out.println("Selecciona la operación: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 5. Potencia");
            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    operacion = new Sumar(numero1, numero2);
                    tipoOperacion = "suma";
                    break;
                case 2:
                    operacion = new Restar(numero1, numero2);
                    tipoOperacion = "resta";
                    break;
                case 3 :
                    operacion = new Multiplicar(numero1, numero2);
                    tipoOperacion = "multiplicacion";
                    break;
                case 4 :
                    operacion = new Dividir(numero1, numero2);
                    tipoOperacion = "division";
                    break;
                case 5 :
                    operacion = new Potencia(numero1, numero2);
                    tipoOperacion = "potenciacion";
                    break;
                default :
                    throw new InputMismatchException("Opción inválida");
            }


            System.out.println("Resultado de la " + tipoOperacion +" es: " +operacion.calcular());
        }catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Debe ser un número.");
        } finally {
            scan.close();
        }

    }
}