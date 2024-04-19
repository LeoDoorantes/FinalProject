import java.util.Scanner;


import Integrantes.integrantes;
import equipo1.Ejercicio1;
import equipo1.Ejercicio2;
import equipo1.Ejercicio3;
import equipo1.Ejercicio4;
import equipo2.Equip2Ejer1;
import equipo2.Equip2Ejer2;
import equipo2.Equip2Ejer3;
import equipo2.Equip2Ejer4;
import equipo3.Equip3Ejer1;
import equipo3.Equip3Ejer2;
import equipo3.Equip3Ejer3;
import equipo3.Equip3Ejer4;
import torreHanoi.torreHanoi;
import Animales_TAP.Animal.Ave;
import Animales_TAP.Animal.JaulaTipo1;
import Animales_TAP.Animal.JaulaTipo2;
import Animales_TAP.Animal.JaulaTipo3;
import Animales_TAP.Animal.Mamifero;
import Animales_TAP.Animal.Reptil;

// Clase para representar a los mamíferos
class Perro extends Mamifero {
    private String tipoPelo;

    public Perro(String nombre, String tipoPelo) {
        super(nombre, tipoPelo);
        this.tipoPelo = tipoPelo;
    }

    public String detalles() {
        return "Tipo de pelo: " + tipoPelo;
    }
}

class Leon extends Mamifero {
    private String tipoPelo;

    public Leon(String nombre, String tipoPelo) {
        super(nombre, tipoPelo);
        this.tipoPelo = tipoPelo;
    }

    public String detalles() {
        return "Tipo de pelo: " + tipoPelo;
    }
}

class Gato extends Mamifero {
    private String tipoPelo;

    public Gato(String nombre, String tipoPelo) {
        super(nombre, tipoPelo);
        this.tipoPelo = tipoPelo;
    }

    public String detalles() {
        return "Tipo de pelo: " + tipoPelo;
    }
}

// Clase para representar a los reptiles
class Vibora extends Reptil {
    private boolean venenoso;

    public Vibora(String nombre, boolean venenoso) {
        super(nombre, venenoso);
        this.venenoso = venenoso;
    }

    public String detalles() {
        return "¿Es venenosa? " + (venenoso ? "Sí" : "No");
    }
}

class Cocodrilo extends Reptil {
    private boolean venenoso;

    public Cocodrilo(String nombre, boolean venenoso) {
        super(nombre, venenoso);
        this.venenoso = venenoso;
    }

    public String detalles() {
        return "¿Es venenoso? " + (venenoso ? "Sí" : "No");
    }
}

class Lagarto extends Reptil {
    private boolean venenoso;

    public Lagarto(String nombre, boolean venenoso) {
        super(nombre, venenoso);
        this.venenoso = venenoso;
    }

    public String detalles() {
        return "¿Es venenoso? " + (venenoso ? "Sí" : "No");
    }
}

// Clase para representar a las aves
class Aguila extends Ave {
    private String tipoPico;

    public Aguila(String nombre, String tipoPico) {
        super(nombre, tipoPico);
        this.tipoPico = tipoPico;
    }

    public String detalles() {
        return "Tipo de pico: " + tipoPico;
    }
}

class Paloma extends Ave {
    private String tipoPico;

    public Paloma(String nombre, String tipoPico) {
        super(nombre, tipoPico);
        this.tipoPico = tipoPico;
    }

    public String detalles() {
        return "Tipo de pico: " + tipoPico;
    }
}

// Clase para representar a los cuervos
class Cuervo extends Ave {
    private String tipoPico;

    public Cuervo(String nombre, String tipoPico) {
        super(nombre, tipoPico);
        this.tipoPico = tipoPico;
    }

    public String detalles() {
        return "Tipo de pico: " + tipoPico;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Desarrolladores");
            System.out.println("2. Parciales");
            System.out.println("3. Salir");

            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    System.out.println("Desarrolladores:");

                    // equipo 1
                    integrantes inte1 = new integrantes();
                    inte1.Integrantes1();

                    // equipo 2
                    integrantes inte2 = new integrantes();
                    inte2.Integrantes2();

                    //equipo 3
                    integrantes inte3 = new integrantes();
                    inte3.Integrantes3();

                    break;
                case 2:
                    boolean regresarParciales = false;
                    while (!regresarParciales) {
                        System.out.println("Seleccione un parcial:");
                        System.out.println("1. Primer parcial");
                        System.out.println("2. Segundo parcial");
                        System.out.println("3. Tercer parcial");
                        System.out.println("4. Regresar al menú principal");

                        int opcionParcial = scanner.nextInt();

                        switch (opcionParcial) {
                            case 1:
                                System.out.println("Seleccione un ejercicio del primer parcial:");
                                System.out.println("            Equipo 1");
                                System.out.println("1. Ejercicio 1");
                                System.out.println("2. Ejercicio 2");
                                System.out.println("3. Ejercicio 3");
                                System.out.println("4. Ejercicio 4");
                                System.out.println("            Equipo 2");
                                System.out.println("5. Ejercicio 5");
                                System.out.println("6. Ejercicio 6");
                                System.out.println("7. Ejercicio 7");
                                System.out.println("8. Ejercicio 8");
                                System.out.println("            Equipo 3");
                                System.out.println("9. Ejercicio 9");
                                System.out.println("10. Ejercicio 10");
                                System.out.println("11. Ejercicio 11");
                                System.out.println("12. Ejercicio 12");

                                int ejercicio = scanner.nextInt();

                                // valores de los ejercicios
                                switch (ejercicio) {
                                    case 1:
                                        System.out.println("Ingrese la altura del rectángulo: ");
                                        int alto = scanner.nextInt();
                                        System.out.println("Ingrese el ancho del rectángulo: ");
                                        int ancho = scanner.nextInt();
                                        Ejercicio1.dibujarRectangulo(alto, ancho);


                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes1();
                                        break;

                                    case 2:
                                        System.out.println("Ingrese un numero: ");
                                        int numeroPalindromo = scanner.nextInt();
                                        Ejercicio2.esPalindromo(numeroPalindromo);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes1();

                                        break;
                                    case 3:
                                        System.out.println("Ingrese un numero para ver si es primo o compuesto: ");
                                        int numeroPrimoCompuesto = scanner.nextInt();
                                        Ejercicio3.esPrimoOCompuesto(numeroPrimoCompuesto);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes1();
                                        break;

                                    case 4:
                                        System.out.println("Ingrese un número para calcular su factorial: ");
                                        int numeroFactorial = scanner.nextInt();
                                        Ejercicio4.factorial(numeroFactorial);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes1();
                                        break;

                                    case 5:
                                        System.out.println("Ingrese un número para la altura del triangulo:  ");
                                        int altura = scanner.nextInt();
                                        Equip2Ejer1 ejer1 = new Equip2Ejer1(altura);
                                        ejer1.Triangulo(altura);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes2();
                                        break;
                                    case 6:
                                        System.out.println(
                                                "Ingrese una palabra sin espacios para saber si es palindromo:  ");
                                        String palabra = scanner.next();
                                        Equip2Ejer2 ejer2 = new Equip2Ejer2(palabra);
                                        ejer2.palindromo(palabra);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes2();
                                        break;

                                    case 7:
                                        // equipo 2 ejercicio 3
                                        System.out.println("Ingrese un número para saber si es primo  ");
                                        int numero = scanner.nextInt();
                                        Equip2Ejer3 ejer3 = new Equip2Ejer3(numero);
                                        ejer3.NumerosPrimos(numero);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes2();
                                        break;

                                    case 8:
                                        // equipo 2 ejercicio 4
                                        System.out.println(
                                                "Ingrese un número hasta el 12 para saber las combinaciones de los dados   ");
                                        int puntaje = scanner.nextInt();
                                        Equip2Ejer4 ejer4 = new Equip2Ejer4(puntaje);
                                        ejer4.contarCombinaciones(puntaje);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes2();
                                        break;

                                    case 9:
                                        // equipo 3 ejercicio 1
                                        System.out.println("Ingrese un valor para su hexágono:  ");
                                        int valor = scanner.nextInt();
                                        Equip3Ejer1 ejercicio1 = new Equip3Ejer1(valor);
                                        ejercicio1.Hexagono(valor);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes3();
                                        break;

                                    case 10:
                                        System.out.println("Ingrese una oración para saber si es palindromo:  ");
                                        // equipo 3 ejercicio 2
                                        String OracionPalindromo = scanner.nextLine();
                                        Equip3Ejer2 ejercicio2 = new Equip3Ejer2(OracionPalindromo);
                                        ejercicio2.IfPalindromo(OracionPalindromo);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes3();
                                        break;

                                    case 11:
                                        System.out.println("Ingrese un número para saber si es primo  ");
                                        // equipo 3 ejercicio 3
                                        int num = scanner.nextInt();
                                        Equip3Ejer3 ejercicio3 = new Equip3Ejer3(num);
                                        ejercicio3.esPrimo(num);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes3();
                                        break;

                                    case 12:
                                        System.out.println("Ingrese el numero de fila para el caballo  ");
                                        // equipo 3 ejercicio 4
                                        int fila = scanner.nextInt();
                                        System.out.println("Ingrese el numero de columna para el caballo  ");
                                        int columna = scanner.nextInt();
                                        Equip3Ejer4 ejercicio4 = new Equip3Ejer4(fila, columna);
                                        ejercicio4.movimientosCaballo(fila, columna);

                                        System.out.println("\n" +"Desarrollado por: ");
                                        integrantes.Integrantes3();
                                        break;

                                }

                                break;
                            case 2:
                                System.out.println("Ejercicios del segundo parcial:");
                                System.out.println("1. Ejercicio 1");

                                // hanoi
                                System.out.println("Ingrese su moviemiento");

                                int discos = scanner.nextInt();
                                ;
                                torreHanoi hanoi = new torreHanoi();
                                int movimientos = hanoi.torreshanoi(discos, 1, 2, 3);
                                System.out.println("Total de movimientos realizados: " + movimientos);

                                System.out.println("\n" +"Desarrollado por: ");
                                integrantes.Integrantes1();
                                integrantes.Integrantes2();
                                integrantes.Integrantes3();

                                break;
                            case 3:
                                System.out.println("Ejercicio del tercer parcial:");
                                System.out.println("1. Ejercicio 1");

                                Perro perro = new Perro("Perro", "Pelo corto");
                                Gato gato = new Gato("Gato", "Pelo largo");
                                Leon leon = new Leon("Leon", "Melena");

                                Vibora vibora = new Vibora("Vibora", true);
                                Cocodrilo cocodrilo = new Cocodrilo("Cocodrilo", true);
                                Lagarto lagarto = new Lagarto("Lagarto", false);

                                Aguila aguila = new Aguila("Aguila", "Pico ganchudo");
                                Paloma paloma = new Paloma("Paloma", "Pico corto");
                                Cuervo cuervo = new Cuervo("Cuervo", "Pico afilado");
                                Cuervo cuervo2 = new Cuervo("Cuervo2", "Afilado pene");

                                // Crear jaulas
                                JaulaTipo1 jaulaTipo1Mamiferos = new JaulaTipo1(Mamifero.class);
                                JaulaTipo3 jaulaReptiles = new JaulaTipo3(Reptil.class);
                                JaulaTipo2 jaulaTipo2Aves = new JaulaTipo2(Ave.class);

                                // Agregar animales a las jaulas
                                jaulaTipo1Mamiferos.agregarAnimal(perro);
                                jaulaTipo1Mamiferos.agregarAnimal(gato);
                                jaulaTipo1Mamiferos.agregarAnimal(leon);

                                jaulaReptiles.agregarAnimal(vibora);
                                jaulaReptiles.agregarAnimal(cocodrilo);
                                jaulaReptiles.agregarAnimal(lagarto);

                                jaulaTipo2Aves.agregarAnimal(aguila);
                                jaulaTipo2Aves.agregarAnimal(paloma);
                                jaulaTipo2Aves.agregarAnimal(cuervo);
                                jaulaTipo2Aves.agregarAnimal(cuervo2);

                                // Imprimir los animales en cada jaula
                                System.out.println("Animales en la jaula de mamíferos:");
                                jaulaTipo1Mamiferos.imprimirAnimales();
                                System.out.println("\nAnimales en la jaula de reptiles:");
                                jaulaReptiles.imprimirAnimales();
                                System.out.println("\nAnimales en la jaula de aves:");
                                jaulaTipo2Aves.imprimirAnimales();

                                System.out.println("\n" +"Desarrollado por: ");
                                integrantes.Integrantes1();
                                integrantes.Integrantes2();
                                integrantes.Integrantes3();
                                break;
                            case 4:
                                regresarParciales = true;
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        scanner.close();

    }
}