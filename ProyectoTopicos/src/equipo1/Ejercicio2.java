/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo1;

/**
 *
 * @author Derik
 */
public class Ejercicio2 {
    public static void esPalindromo(int entrada) {
        String cadena = String.valueOf(entrada);
        boolean palindromo = true;

        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
                palindromo = false; // No es palíndromo si los caracteres no coinciden en las posiciones correspondientes
                break;
            }
        }

        if (palindromo) {
            System.out.println("Sí es palíndromo el número " + entrada);
        } else {
            System.out.println("No es palíndromo el número " + entrada);
        }
    }
}
