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

        // Ejercicio1
        System.out.println("Ingrese la altura del rectángulo: " );
        int alto = 2;
        System.out.println("Ingrese el ancho del rectángulo: ");
        int ancho = 2;
        Ejercicio1.dibujarRectangulo(alto, ancho);

        // Ejercicio2
        int numeroPalindromo = 23;
        Ejercicio2.esPalindromo(numeroPalindromo);

        // Ejercicio3
        int numeroPrimoCompuesto = 88;
        Ejercicio3.esPrimoOCompuesto(numeroPrimoCompuesto);


        // Ejercicio4
        System.out.println("Ingrese un número para calcular su factorial: ");
        int numeroFactorial = 8;
        Ejercicio4.factorial(numeroFactorial);

        //ejercicio 1 equipo 2
        int altura = scanner.nextInt();
        Equip2Ejer1 ejer1 = new Equip2Ejer1(altura);
        ejer1.Triangulo(altura);

        // ejercicio 2 equipo 2
        String palabra = "jorge el curioso";
        Equip2Ejer2 ejer2 = new Equip2Ejer2(palabra);
        ejer2.palindromo(palabra);


        // equipo 2 ejercicio 3
        int numero = 5;
        Equip2Ejer3 ejer3 = new Equip2Ejer3(numero);
        ejer3.NumerosPrimos(numero);

        // equipo 2 ejercicio 4
        int puntaje = 10;
        Equip2Ejer4 ejer4 = new Equip2Ejer4(puntaje);
        ejer4.contarCombinaciones(puntaje);


        // equipo 3 ejercicio 1
        int valor = 5;
        Equip3Ejer1 ejercicio1 = new Equip3Ejer1(valor);
        ejercicio1.Hexagono(valor);

        // equipo 3 ejercicio 2
        String OracionPalindromo = "Anita lava la tina";
        Equip3Ejer2 ejercicio2 = new Equip3Ejer2(OracionPalindromo);
        ejercicio2.IfPalindromo(OracionPalindromo);

        // equipo 3 ejercicio 3
        int num = 9;
        Equip3Ejer3 ejercicio3 = new Equip3Ejer3(num);
        ejercicio3.esPrimo(num);

        // equipo 3 ejercicio 4
        int fila = 3;
        int columna = 4;
        Equip3Ejer4 ejercicio4 = new Equip3Ejer4(fila, columna);
        ejercicio4.movimientosCaballo(fila, columna);

        // hanoi
        int discos = 4;
        torreHanoi hanoi = new torreHanoi();
        int movimientos = hanoi.torreshanoi(discos,1,2,3);
        System.out.println("Total de movimientos realizados: " + movimientos);

    }
}