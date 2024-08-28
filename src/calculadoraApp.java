import java.util.Scanner;

public class calculadoraApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("---- Calculadora ----");

                //Llamada al menú
                mostrarMenu();

                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion >= 1 && operacion <= 4) {

                    //Llamada al operador
                    realizarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción errónea (" + operacion + ")");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    //Función de mostrar el menú:
    private static void mostrarMenu() {
        System.out.println("1.Suma \n2.Resta \n3.Multiplicación \n4.División \n5.Salir");
        System.out.print("Selecciona la operación a realizar:");
    }

    //Función encargada de operar:
    private static void realizarOperacion(int operacion, Scanner consola) {
        System.out.print("Introduce el primer operando: ");
        var op1 = Double.parseDouble(consola.nextLine());

        System.out.print("Introduce el segundo operando: ");
        var op2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = op1 + op2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                resultado = op1 - op2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                resultado = op1 * op2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
            }
            case 4 -> {
                resultado = op1 / op2;
                System.out.println("El resultado de la división es: " + resultado);
            }
            default -> {
                System.out.println("Opción errónea (" + operacion + ")");
            }
        }
    }
}
