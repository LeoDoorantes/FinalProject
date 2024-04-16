package equipo2;

public class Equip2Ejer4 {


    public Equip2Ejer4(int puntaje) {
    }

    public static int contarCombinaciones(int puntaje) {
        int contador = 0;
        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == puntaje) {
                    contador++;
                }
            }
        }
        System.out.println("Combinaciones: ");
        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == puntaje) {
                    System.out.println("(" + dado1 + ", " + dado2 + ")");
                }
            }
        }

        return contador;




    }
}
