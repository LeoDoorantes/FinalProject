package equipo2;

public class Equip2Ejer1 {

    public Equip2Ejer1(int altura) {
    }

    public static void Triangulo(int altura){
        for (int i = 1; i <= altura; i++) {
            for(int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
