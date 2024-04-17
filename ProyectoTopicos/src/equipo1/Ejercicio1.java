package equipo1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derik
 */
public class Ejercicio1 {
    public Ejercicio1(int alto, int ancho) {
    }


    public static String dibujarRectangulo(int alto, int ancho) {
        for (int i = 0; i < alto; i++) {
            if (i == 0 || i == alto - 1) {

                System.out.println("*".repeat(ancho)); // Llena la primera y última fila con asteriscos
            } else {
                System.out.println("*" + " ".repeat(ancho - 2) + "*"); // Llena el resto con asterisco en los extremos y espacios en el medio
            }
        }
        return null;
    }
}
