package torreHanoi;

public class torreHanoi {

    private int contadorMovimientos = 0;

    public int torreshanoi(int discos, int torre1, int torre2, int torre3) {

        if (discos == 1) {
            contadorMovimientos++;
        } else {
            torreshanoi(discos - 1, torre1, torre3, torre2);
            contadorMovimientos++;
            torreshanoi(discos - 1, torre2, torre1, torre3);
        }

        return contadorMovimientos;
    }

    public int getContadorMovimientos() {
        return contadorMovimientos;
    }

    public void resetContadorMovimientos() {
        contadorMovimientos = 0;
    }
}