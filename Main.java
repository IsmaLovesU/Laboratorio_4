/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase Main - Laboratorio 4
 * 15/11/2024
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RadioGestionador radioGestionador = new RadioGestionador();
        ReproduccionGestionador reproduccionGestionador = new ReproduccionGestionador();
        TelefonoGestionador telefonoGestionador = new TelefonoGestionador();
        ClaseAGestionador claseAGestionador = new ClaseAGestionador();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        boolean isOn = false;
        int opcion;

        do {
            System.out.println("\n--- Radio Mercedes-Benz ---");
            System.out.println(isOn ? "Estado: Encendido" : "Estado: Apagado");
            System.out.println("1. Encender/Apagar");
            System.out.println("2. Modo Radio");
            System.out.println("3. Modo Reproducción");
            System.out.println("4. Modo Teléfono");
            System.out.println("5. Modo Productividad");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                isOn = !isOn;
                System.out.println(isOn ? "Radio encendido." : "Radio apagado.");
                continue;
            }

            if (!isOn && opcion != 6) {
                System.out.println("El radio está apagado. Enciéndelo primero.");
                continue;
            }

            switch (opcion) {
                case 2:
                    System.out.println("\n--- Modo Radio ---");
                    System.out.println("1. Cambiar Modulación");
                    System.out.println("2. Cambiar Emisora");
                    System.out.println("3. Guardar Emisora");
                    System.out.println("4. Cargar Emisora");
                    System.out.print("Seleccione una opción: ");
                    int opcionRadio = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionRadio) {
                        case 1:
                            System.out.println(radioGestionador.cambiarModulacion());
                            break;
                        case 2:
                            System.out.print("Ingrese la nueva emisora: ");
                            double nuevaEmisora = scanner.nextDouble();
                            System.out.println(radioGestionador.cambiarEmisora(nuevaEmisora));
                            break;
                        case 3:
                            System.out.print("Ingrese la emisora a guardar: ");
                            double emisora = scanner.nextDouble();
                            System.out.println(radioGestionador.guardarEmisora(emisora));
                            break;
                        case 4:
                            System.out.print("Ingrese la posición de la emisora a cargar: ");
                            int posicion = scanner.nextInt();
                            System.out.println(radioGestionador.cargarEmisora(posicion));
                            break;
                        default:
                            System.out.println("Opción inválida en Modo Radio.");
                }
                break;

                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Cerrando el programa, nos vemos...");
                    break;

                default:
                    System.out.println("Opción inválida en el menú principal.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}    