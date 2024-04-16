package equipo2;

public class Equip2Ejer3 {

    public Equip2Ejer3(int numero) {
    }

    public static void NumerosPrimos(int numero) {
        if (numero < 2) {
            System.out.println(numero + " no es un número primo");
            return;
        }

        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
    }

    public static void main(String[] args) {
        int numero = 17; // Puedes cambiar este número para probar
        NumerosPrimos(numero);
    }
}
