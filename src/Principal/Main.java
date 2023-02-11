package Principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean estado = true;

        System.out.println("======================");
        System.out.println("Bienvenido a tu carage");
        System.out.println("======================");
        Garaje garaje = new Garaje();

        while (estado) {
            System.out.println("------------------");
            System.out.println("1. Agregar coche");
            System.out.println("2. Ver carage");
            System.out.println("------------------");

            System.out.print("Opcion: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("De que tipo es su coche");
                    System.out.println("1. Normal");
                    System.out.println("2. Deportivo");

                    Coche coche = null;
                    System.out.print("Opcion: ");
                    int opcion = input.nextInt();
                    input.nextLine(); // Discard the rest of the line.
                                      // https://stackoverflow.com/questions/13993987/java-util-scanner-jumps-over-input-requests
                    if (opcion == 1) {
                        System.out.println("Marca: ");
                        String marca = input.nextLine();
                        System.out.println("Modelo: ");
                        String modelo = input.nextLine();
                        System.out.println("Numero de puertas: ");
                        int nPuertas = input.nextInt();
                        System.out.println("Año: ");
                        int año = input.nextInt();
                        System.out.println("Precio: ");
                        double precio = input.nextDouble();
                        coche = new Coche(marca, modelo, año, nPuertas, precio);
                    } else if (opcion == 2) {
                        System.out.println("Marca: ");
                        String marca = input.nextLine();
                        System.out.println("Modelo: ");
                        String modelo = input.nextLine();
                        System.out.println("Numero de puertas: ");
                        int nPuertas = input.nextInt();
                        System.out.println("Año: ");
                        int año = input.nextInt();
                        System.out.println("Precio: ");
                        double precio = input.nextDouble();
                        System.out.println("Maxima velocidad: ");
                        int maxVelocidad = input.nextInt();

                        coche = new Deportivo(marca, modelo, año, nPuertas, precio, maxVelocidad);
                    }

                    garaje.agregarCoche(coche);
                    break;
                case 2:
                    garaje.mostrarCoches();
                    break;
                default:
                    estado = false;
            }
        }
        input.close();
    }
}
