import java.util.Scanner;
import java.lang.Math; // importa java.lang packg

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Calcular edad");
            System.out.println("2. Calcular promedio de tres notas");
            System.out.println("3. Calcular distancia entre coordenadas");
            System.out.println("4. Calcular interés simple");
            System.out.println("5. Calcular área de un rectángulo");
            System.out.println("6. Calcular perímetro de un círculo");
            System.out.println("7. Convertir temperatura de Celsius a Fahrenheit");
            System.out.println("8. Calcular área de un triángulo");
            System.out.println("9. Calcular precio con IVA");
            System.out.println("10. Convertir pesos chilenos a dólares");
            System.out.println("11. Calcular el año de jubilación");
            System.out.println("12. Convertir minutos a horas y minutos");
            System.out.println("13. Salir");

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
                    areaRectangulo(scan);
                    break;
                case 6:
                    perimetroCirculo(scan);
                    break;
                case 7:
                    convertirTemperatura(scan);
                    break;
                case 8:
                    areaTriangulo(scan);
                    break;
                case 9:
                    calcularIVA(scan);
                    break;
                case 10:
                    convertirMoneda(scan);
                    break;
                case 11:
                    calcularAnioJubilacion(scan);
                    break;
                case 12:
                    convertirMinutosAHoras(scan);
                    break;
                case 13:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }

    //1- Area de un rectangulo
    public static void areaRectangulo(Scanner scan){
        System.out.println("Ingrese la base");
        int base = scan.nextInt();
        System.out.println("Ingrese la altura");
        int altura = scan.nextInt();
        System.out.println("El area es: " + (base * altura));
    }
    //2- Perimetro de un circulo
    public static void perimetroCirculo(Scanner scan){
        System.out.println("Ingrese el radio del circulo");
        double radio = scan.nextDouble();
        double result = radio * 3.14 * 2;
        System.out.println("El resultado es:" + result);
    }

    //3- Conversion Temperatura 
    public static void convertirTemperatura(Scanner scan){
        System.out.println("Ingrese los grados en celsius");
        double celsius = scan.nextDouble();
        double faren = (celsius * 9/5) + 32;

        System.out.println("En Farenheit son: " + faren);

    }

    //4- Área de un triángulo
public static void areaTriangulo(Scanner scan) {
    System.out.println("Ingrese la base del triángulo:");
    double base = scan.nextDouble();
    System.out.println("Ingrese la altura del triángulo:");
    double altura = scan.nextDouble();
    double area = (base * altura) / 2;
    System.out.println("El área del triángulo es: " + area);
}

//5- Calcula el IVA
public static void calcularIVA(Scanner scan) {
    System.out.println("Ingrese el precio del producto:");
    double precio = scan.nextDouble();
    double precioConIVA = precio * 1.19; // IVA del 19%
    System.out.println("El precio con IVA es: " + precioConIVA);
}

//6- Conversión de moneda (CLP a USD)
public static void convertirMoneda(Scanner scan) {
    System.out.println("Ingrese la cantidad en pesos chilenos (CLP):");
    double pesosChilenos = scan.nextDouble();
    System.out.println("Ingrese el tipo de cambio actual (CLP a USD):");
    double tipoCambio = scan.nextDouble();
    double dolares = pesosChilenos / tipoCambio;
    System.out.println("El valor en dólares es: " + dolares);
}

//7- Calcula el año de jubilación
public static void calcularAnioJubilacion(Scanner scan) {
    System.out.println("Ingrese su edad actual:");
    int edadActual = scan.nextInt();
    System.out.println("Ingrese el año actual:");
    int anioActual = scan.nextInt();
    int anioJubilacion = anioActual + (65 - edadActual);
    System.out.println("El año en el que cumplirá 65 años es: " + anioJubilacion);
}

//8- Conversión de minutos a horas y minutos
public static void convertirMinutosAHoras(Scanner scan) {
    System.out.println("Ingrese la cantidad de minutos:");
    int minutos = scan.nextInt();
    int horas = minutos / 60;
    int minutosRestantes = minutos % 60;
    System.out.println("Equivale a: " + horas + " horas y " + minutosRestantes + " minutos.");
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

    public static void resolverEcuacionCuadratica(Scanner scan) {
        System.out.println("Ingrese el coeficiente a:");
        double a = scan.nextDouble();
        System.out.println("Ingrese el coeficiente b:");
        double b = scan.nextDouble();
        System.out.println("Ingrese el coeficiente c:");
        double c = scan.nextDouble();
    //potencia o eleva numero con math.pow
        double discriminante = Math.pow(b, 2) - 4 * a * c;
    //math.sqrt es la raiz cuadrada
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raizUnica = -b / (2 * a);
            System.out.println("La raíz única es: " + raizUnica);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
}
