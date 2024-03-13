//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String opcion;

        do {
            mostrarMenu();
            opcion = sc.next();
            sc.nextLine();
            switch (opcion) {
                case "1":
                    sumar();
                    break;
                case "2":
                    restar();
                    break;
                case "3":
                    multiplicar();
                    break;
                case "4":

                    break;
                case "0":
                    System.out.println(" -SALIR- ");
                    System.out.println("¡HASTA LUEGO, USUARIO!");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (!opcion.equals("0"));


    }

    public static void mostrarMenu() {
        System.out.println(" --------------CALCULADORA-------------- ");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("0. SALIR");
        System.out.println(" -------------------------------- ");
        System.out.println("INTRODUCE OPCION: ");
    }

    public static void sumar() {
        System.out.println(" -1:SUMAR- ");
        System.out.println("INTRODUCE LA PRIMERA CIFRA: ");
        double sum1 = sc.nextDouble();
        System.out.println("AHORA INTRODUCE LA SEGUNDA CIFRA: ");
        double sum2 = sc.nextDouble();
        double suma = sum1 + sum2;
        System.out.println("EL RESULTADO ES: " + suma);
    }

    public static void restar() {
        System.out.println(" -2:RESTAR- ");
        System.out.println("INTRODUCE LA PRIMERA CIFRA");
        double rest1 = sc.nextDouble();
        System.out.println("AHORA INTRODUCE LA CIFRA QUE LE QUIERES RESTAR A LA PRIMERA");
        double rest2 = sc.nextDouble();
        double resta = rest1 - rest2;
        System.out.println("EL RESULTADO ES: " + resta);
    }

    public static void multiplicar() {
        System.out.println(" -3: MULTIPLICAR- ");
        System.out.println("INTRODUCE LA PRIMERA CIFRA");
        double mult1 = sc.nextDouble();
        System.out.println("AHORA INTRODUCE LA SEGUNDA CIFRA");
        double mult2 = sc.nextDouble();
        double multiplicacion = mult1 * mult2;
        System.out.println("EL RESULTADO ES: " + multiplicacion);
    }
}