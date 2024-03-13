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
                    System.out.println(" -1:SUMAR- ");
                    System.out.println("INTRODUCE LA PRIMERA CIFRA: ");
                    double sum1 = sc.nextDouble();
                    System.out.println("AHORA INTRODUCE LA SEGUNDA CIFRA: ");
                    double sum2 = sc.nextDouble();
                    sumar(sum1, sum2);
                    break;
                case "2":
                    System.out.println(" -2:RESTAR- ");
                    System.out.println("INTRODUCE LA PRIMERA CIFRA");
                    double rest1 = sc.nextDouble();
                    System.out.println("AHORA INTRODUCE LA CIFRA QUE LE QUIERES RESTAR A LA PRIMERA");
                    double rest2 = sc.nextDouble();
                    restar(rest1, rest2);
                    break;
                case "3":
                    multiplicar();
                    break;
                case "4":
                    dividir();
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

    public static double sumar(double sum1, double sum2) {

        double suma = sum1 + sum2;
        System.out.println("EL RESULTADO ES: " + suma);
        return suma;
    }

    public static double restar(double rest1, double rest2) {

        double resta = rest1 - rest2;
        System.out.println("EL RESULTADO ES: " + resta);
        return resta;
    }

    public static double multiplicar() {
        System.out.println(" -3: MULTIPLICAR- ");
        System.out.println("INTRODUCE LA PRIMERA CIFRA");
        double mult1 = sc.nextDouble();
        System.out.println("AHORA INTRODUCE LA SEGUNDA CIFRA");
        double mult2 = sc.nextDouble();
        double multiplicacion = mult1 * mult2;
        System.out.println("EL RESULTADO ES: " + multiplicacion);
        return multiplicacion;
    }

    public static double dividir() {
        System.out.println(" -4: DIVIDIR- ");
        System.out.println("INTRODUCE LA PRIMERA CIFRA");
        double div1 = sc.nextDouble();
        System.out.println("AHORA INTRODUCE LA CIFRA POR LA QUE QUIERES DIVIDIR A LA PRIMERA");
        double div2 = sc.nextDouble();
        if (div2 == 0) {
            double division = 0;
            System.out.println("EL RESULTADO ES: " + division);
            return division;

        } else {
            double division = div1 / div2;
            System.out.println("EL RESULTADO ES: " + division);
            return division;
        }

    }
}