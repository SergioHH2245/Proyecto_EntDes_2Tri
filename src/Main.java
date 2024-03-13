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

                    break;
                case "2":

                    break;
                case "3":

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
}