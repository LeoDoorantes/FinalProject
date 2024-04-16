package equipo3;

public class Equip3Ejer2 {
    public Equip3Ejer2(String OracionPalindromo) {

    }

    public static void IfPalindromo(String OracionPalindromo) {
        String cadena = OracionPalindromo.replace(" ", "").toLowerCase();
        String texto = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            texto += cadena.charAt(i);
        }
        System.out.println(OracionPalindromo);

        if (texto.equals(cadena)) {
            System.out.println("es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
