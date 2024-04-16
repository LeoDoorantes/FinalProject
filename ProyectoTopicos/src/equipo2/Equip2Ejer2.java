package equipo2;

public class Equip2Ejer2 {
    public Equip2Ejer2(String palabra) {

    }

    public static void palindromo(String palabra) {
        String cadena = palabra.replace(" ", "").toLowerCase();
        String texto = "";

        for( int i = cadena.length() - 1; i>= 0; i--) {
            texto += cadena.charAt(i);
        }
        System.out.println(palabra);

        if(texto.equals(cadena)){
            System.out.println("es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
