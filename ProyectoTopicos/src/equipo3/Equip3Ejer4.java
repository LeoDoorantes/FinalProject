package equipo3;

public class Equip3Ejer4 {

    public Equip3Ejer4(int fila, int columna) {
        movimientosCaballo(fila, columna);
    }

    public static void movimientosCaballo(int fila, int columna) {
        int[][] movimientos = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

        System.out.println("Posiciones a las que el caballo puede desplazarse:");
        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaColumna >= 1 && nuevaColumna <= 8) {
                System.out.println("(" + nuevaFila + ", " + nuevaColumna + ")");
            }
        }
    }
}

