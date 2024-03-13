//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * @author SergioHH_22
 */


import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);

    /**
     * Metodo main en el que se muestra el menu y nos permite usar la calculadora
     * Se puede sumar, restar, multiplicar y dividir
     *
     * @param args
     */
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
                    System.out.println(" -3: MULTIPLICAR- ");
                    System.out.println("INTRODUCE LA PRIMERA CIFRA");
                    double mult1 = sc.nextDouble();
                    System.out.println("AHORA INTRODUCE LA SEGUNDA CIFRA");
                    double mult2 = sc.nextDouble();
                    multiplicar(mult1, mult2);
                    break;
                case "4":
                    System.out.println(" -4: DIVIDIR- ");
                    System.out.println("INTRODUCE LA PRIMERA CIFRA");
                    double div1 = sc.nextDouble();
                    System.out.println("AHORA INTRODUCE LA CIFRA POR LA QUE QUIERES DIVIDIR A LA PRIMERA");
                    double div2 = sc.nextDouble();
                    dividir(div1, div2);
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

    /**
     * Este metodo muestra el menu de la maquina
     */
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

    /**
     * El metodo que corresponde a la suma
     * Suma una cifra con otra y muestra su resultado
     *
     * @param sum1 La primera cifra
     * @param sum2 La segunda cifra que sumas a la primera
     * @return El resultado de la suma
     */
    public static double sumar(double sum1, double sum2) {


        double suma = sum1 + sum2;
        System.out.println("EL RESULTADO ES: " + suma);
        return suma;
    }

    /**
     * El metodo que corresponde a la resta
     * Resta el valor de una cifra a otra y muestra el resultado
     *
     * @param rest1 La primera cifra
     * @param rest2 La segunda cifra la cual restas a la primera
     * @return El resultado de la resta
     */
    public static double restar(double rest1, double rest2) {

        double resta = rest1 - rest2;
        System.out.println("EL RESULTADO ES: " + resta);
        return resta;
    }

    /**
     * El metodo que corresponde a la multiplicacion
     * Multiplica una cifra por otra y muestra el resultado
     *
     * @param mult1 La primera cifra
     * @param mult2 La segunda cifra por la que multiplicas la primera
     * @return El resultado de la multiplicacion
     */
    public static double multiplicar(double mult1, double mult2) {

        double multiplicacion = mult1 * mult2;
        System.out.println("EL RESULTADO ES: " + multiplicacion);
        return multiplicacion;
    }

    /**
     * El metodo que corresponde a la division
     * Divide una cifra por otra y muestra el resultado
     *
     * @param div1 La primera cifra
     * @param div2 La segunda cifra por la que divides a la primera
     * @return El resultado de la división
     */
    public static double dividir(double div1, double div2) {

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