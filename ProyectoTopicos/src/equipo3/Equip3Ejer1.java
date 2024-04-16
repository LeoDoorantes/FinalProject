package equipo3;

public class Equip3Ejer1 {

    public Equip3Ejer1(int valor) {
    }

    public static void Hexagono(int valor) {
        int i, j, k;

        for (i = 1; i <= 2 * valor - 1; i++) {
            // Espacios antes de los asteriscos
            for (j = 1; j <= Math.abs(valor - i); j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (k = 1; k <= 2 * valor - 1 - Math.abs(valor - i); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
