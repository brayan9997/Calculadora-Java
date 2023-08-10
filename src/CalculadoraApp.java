import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {

            System.out.println("**** Aplicacion Calculadora ****");
            mostarMenu();
            try {
                int accion = consola.nextInt();

                if (accion >= 1 && accion <= 5) {
                ejecutarAccion(accion, consola);
                } else if (accion == 6) {
                    System.out.println("Hasta luego....");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + accion);
                }
                System.out.println();

            }
            catch (Exception e){
                System.out.println("Ocurrio un error" + e.getMessage());
            }
        } //fin while
    } //fin main

    private static void mostarMenu(){
        System.out.println("Seleccione la acción a realizar:");

        System.out.println("1 - Suma.");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Modulo");
        System.out.println("6 - Salir");
    }
    private static void ejecutarAccion(int accion, Scanner consola){
        System.out.print("Proporciona el valor 1: ");
        double val1 = consola.nextInt();
        System.out.print("Proporciona el valor 2: ");
        double val2 = consola.nextInt();

        switch (accion) {
            case 1 -> System.out.println("El valor es " + (val1 + val2));

            case 2 -> System.out.println("El valor es " + (val1 - val2));

            case 3 -> System.out.println("El valor es " + (val1 * val2));

            case 4 -> System.out.println("El valor es " + (val1 / val2));

            case 5 -> System.out.println("El valor es " + (val1 % val2));

            default -> System.out.println("Opcion erronea: " + accion);
        }
    }
} //fin clase