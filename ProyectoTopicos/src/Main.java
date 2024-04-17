import java.util.Scanner;

import equipo1.Ejercicio1;
import equipo1.Ejercicio2;
import equipo1.Ejercicio3;
import equipo1.Ejercicio4;
import equipo2.Equip2Ejer1;
import equipo2.Equip2Ejer2;
import equipo2.Equip2Ejer3;
import equipo2.Equip2Ejer4;
import equipo3.Equip3Ejer1;
import equipo3.Equip3Ejer2;
import equipo3.Equip3Ejer3;
import equipo3.Equip3Ejer4;
import torreHanoi.torreHanoi;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // hanoi
        int discos = 4;
        torreHanoi hanoi = new torreHanoi();
        int movimientos = hanoi.torreshanoi(discos,1,2,3);
        System.out.println("Total de movimientos realizados: " + movimientos);


        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Desarrolladores");
            System.out.println("2. Parciales");
            System.out.println("3. Salir");

            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    System.out.println("Desarrolladores:");
                    System.out.println("1. Juan");
                    System.out.println("2. María");
                    break;
                case 2:
                    boolean regresarParciales = false;
                    while (!regresarParciales) {
                        System.out.println("Seleccione un parcial:");
                        System.out.println("1. Primer parcial");
                        System.out.println("2. Segundo parcial");
                        System.out.println("3. Tercer parcial");
                        System.out.println("4. Regresar al menú principal");

                        int opcionParcial = scanner.nextInt();

                        switch (opcionParcial) {
                            case 1:
                                System.out.println("Seleccione un ejercicio del primer parcial:");
                                System.out.println("            Equipo 1");
                                System.out.println("1. Ejercicio 1");
                                System.out.println("2. Ejercicio 2");
                                System.out.println("3. Ejercicio 3");
                                System.out.println("4. Ejercicio 4");
                                System.out.println("            Equipo 2");
                                System.out.println("5. Ejercicio 5");
                                System.out.println("6. Ejercicio 6");
                                System.out.println("7. Ejercicio 7");
                                System.out.println("8. Ejercicio 8");
                                System.out.println("            Equipo 3");
                                System.out.println("9. Ejercicio 9");
                                System.out.println("10. Ejercicio 10");
                                System.out.println("11. Ejercicio 11");
                                System.out.println("12. Ejercicio 12");

                                int ejercicio = scanner.nextInt();

                                // valores de los ejercicios
                                    switch (ejercicio){
                                        case 1:
                                            System.out.println("Ingrese la altura del rectángulo: " );
                                            int alto = scanner.nextInt();
                                            System.out.println("Ingrese el ancho del rectángulo: ");
                                            int ancho = scanner.nextInt();
                                            Ejercicio1.dibujarRectangulo(alto, ancho);
                                            break;

                                        case 2:
                                            System.out.println("Ingrese un numero: ");
                                            int numeroPalindromo = scanner.nextInt();
                                            Ejercicio2.esPalindromo(numeroPalindromo);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese un numero para ver si es primo o compuesto: ");
                                            int numeroPrimoCompuesto = scanner.nextInt();
                                            Ejercicio3.esPrimoOCompuesto(numeroPrimoCompuesto);
                                            break;

                                        case 4:
                                            System.out.println("Ingrese un número para calcular su factorial: ");
                                            int numeroFactorial = scanner.nextInt();
                                            Ejercicio4.factorial(numeroFactorial);
                                            break;

                                        case 5:
                                            System.out.println("Ingrese un número para la altura del triangulo:  ");
                                            int altura = scanner.nextInt();
                                            Equip2Ejer1 ejer1 = new Equip2Ejer1(altura);
                                            ejer1.Triangulo(altura);
                                            break;
                                        case 6:
                                            System.out.println("Ingrese una palabra sin espacios para saber si es palindromo:  ");
                                            String palabra = scanner.next();
                                            Equip2Ejer2 ejer2 = new Equip2Ejer2(palabra);
                                            ejer2.palindromo(palabra);
                                            break;

                                        case 7:
                                            // equipo 2 ejercicio 3
                                            System.out.println("Ingrese un número para saber si es primo  ");
                                            int numero = scanner.nextInt();
                                            Equip2Ejer3 ejer3 = new Equip2Ejer3(numero);
                                            ejer3.NumerosPrimos(numero);
                                            break;

                                        case 8:
                                            // equipo 2 ejercicio 4
                                            System.out.println("Ingrese un número hasta el 12 para saber las combinaciones de los dados   ");
                                            int puntaje = scanner.nextInt();
                                            Equip2Ejer4 ejer4 = new Equip2Ejer4(puntaje);
                                            ejer4.contarCombinaciones(puntaje);
                                            break;

                                        case 9:
                                            // equipo 3 ejercicio 1
                                            System.out.println("Ingrese un valor para su hexágono:  ");
                                            int valor = scanner.nextInt();
                                            Equip3Ejer1 ejercicio1 = new Equip3Ejer1(valor);
                                            ejercicio1.Hexagono(valor);
                                            break;

                                        case 10:
                                            System.out.println("Ingrese una oración para saber si es palindromo:  ");
                                            // equipo 3 ejercicio 2
                                            String OracionPalindromo = scanner.nextLine();
                                            Equip3Ejer2 ejercicio2 = new Equip3Ejer2(OracionPalindromo);
                                            ejercicio2.IfPalindromo(OracionPalindromo);
                                            break;

                                        case 11:
                                            System.out.println("Ingrese un número para saber si es primo  ");
                                            // equipo 3 ejercicio 3
                                            int num = scanner.nextInt();
                                            Equip3Ejer3 ejercicio3 = new Equip3Ejer3(num);
                                            ejercicio3.esPrimo(num);


                                        case 12:
                                            System.out.println("Ingrese el numero de fila para el caballo  ");
                                            // equipo 3 ejercicio 4
                                            int fila = scanner.nextInt();
                                            System.out.println("Ingrese el numero de columna para el caballo  ");
                                            int columna = scanner.nextInt();
                                            Equip3Ejer4 ejercicio4 = new Equip3Ejer4(fila, columna);
                                            ejercicio4.movimientosCaballo(fila, columna);


                                    }

                                break;
                            case 2:
                                System.out.println("Ejercicios del segundo parcial:");
                                System.out.println("1. Ejercicio 1");
                                System.out.println("2. Ejercicio 2");
                                // Puedes incluir más ejercicios aquí
                                //int ejercicio2 = scanner.nextInt();

                                break;
                            case 3:
                                System.out.println("Ejercicio del tercer parcial:");
                                System.out.println("1. Ejercicio 1");
                                //int ejercicio3 = scanner.nextInt();

                                break;
                            case 4:
                                regresarParciales = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        scanner.close();


    }
}