package equipo3;

public class Equip3Ejer3 {

    public Equip3Ejer3(int num) {
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            boolean ifPrimo = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    ifPrimo = false;
                    break;
                }
            }
            if (ifPrimo) {
                System.out.print(i + " ");
            }
        }
        return false;
    }
}

