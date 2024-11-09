import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular edad");
            System.out.println("2. Calcular promedio de tres notas");
            System.out.println("3. Calcular coordenadas");
            System.out.println("4. Calcular interes simple");
            System.out.println("5. Salir");


            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    calcularEdad(scan);
                    break;
                case 2:
                    calcularPromedio(scan);
                    break;
                case 3:
                    calcularDistancia(scan);
                    break;
                case 4:
                    calcularInteres(scan);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }

    // Método para calcular la edad
    public static void calcularEdad(Scanner scan) {
        System.out.print("Ingrese el año actual: ");
        int anioActual = scan.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        int anioNacimiento = scan.nextInt();
        int edad = anioActual - anioNacimiento;
        System.out.println("Su edad es: " + edad);
    }

    // Método para calcular el promedio de tres notas
    public static void calcularPromedio(Scanner scan) {
        System.out.print("Ingrese la primera nota: ");
        int nota1 = scan.nextInt();
        System.out.print("Ingrese la segunda nota: ");
        int nota2 = scan.nextInt();
        System.out.print("Ingrese la tercera nota: ");
        int nota3 = scan.nextInt();
        int promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
    }

    public static void calcularInteres(Scanner scan){
        System.out.println("Ingrese el monto inicial");
        double monto = scan.nextDouble();
        System.out.println("Ingrese los años");
        int anios = scan.nextInt();
        System.out.println("La tasa de interes anual es del 10 %");
        double interesSimple = monto * 0.10 * anios;

        System.out.println("Lo que obtendria de ganancia es: " + interesSimple);

    }

    public static void calcularDistancia(Scanner scan) {
        System.out.print("Ingrese la coordenada x1: ");
        double x1 = scan.nextDouble();
        System.out.print("Ingrese la coordenada y1: ");
        double y1 = scan.nextDouble();
        System.out.print("Ingrese la coordenada x2: ");
        double x2 = scan.nextDouble();
        System.out.print("Ingrese la coordenada y2: ");
        double y2 = scan.nextDouble();

        // Calcula la distancia usando la fórmula
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}
