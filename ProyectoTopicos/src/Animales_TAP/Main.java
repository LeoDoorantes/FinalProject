
// // Clase para representar a los mamíferos
// class Perro extends Mamifero {
// private String tipoPelo;

// public Perro(String nombre, String tipoPelo) {
// super(nombre, tipoPelo);
// this.tipoPelo = tipoPelo;
// }

// public String detalles() {
// return "Tipo de pelo: " + tipoPelo;
// }
// }

// class Leon extends Mamifero {
// private String tipoPelo;

// public Leon(String nombre, String tipoPelo) {
// super(nombre, tipoPelo);
// this.tipoPelo = tipoPelo;
// }

// public String detalles() {
// return "Tipo de pelo: " + tipoPelo;
// }
// }

// class Gato extends Mamifero {
// private String tipoPelo;

// public Gato(String nombre, String tipoPelo) {
// super(nombre, tipoPelo);
// this.tipoPelo = tipoPelo;
// }

// public String detalles() {
// return "Tipo de pelo: " + tipoPelo;
// }
// }

// // Clase para representar a los reptiles
// class Vibora extends Reptil {
// private boolean venenoso;

// public Vibora(String nombre, boolean venenoso) {
// super(nombre, venenoso);
// this.venenoso = venenoso;
// }

// public String detalles() {
// return "¿Es venenosa? " + (venenoso ? "Sí" : "No");
// }
// }

// class Cocodrilo extends Reptil {
// private boolean venenoso;

// public Cocodrilo(String nombre, boolean venenoso) {
// super(nombre, venenoso);
// this.venenoso = venenoso;
// }

// public String detalles() {
// return "¿Es venenoso? " + (venenoso ? "Sí" : "No");
// }
// }

// class Lagarto extends Reptil {
// private boolean venenoso;

// public Lagarto(String nombre, boolean venenoso) {
// super(nombre, venenoso);
// this.venenoso = venenoso;
// }

// public String detalles() {
// return "¿Es venenoso? " + (venenoso ? "Sí" : "No");
// }
// }

// // Clase para representar a las aves
// class Aguila extends Ave {
// private String tipoPico;

// public Aguila(String nombre, String tipoPico) {
// super(nombre, tipoPico);
// this.tipoPico = tipoPico;
// }

// public String detalles() {
// return "Tipo de pico: " + tipoPico;
// }
// }

// class Paloma extends Ave {
// private String tipoPico;

// public Paloma(String nombre, String tipoPico) {
// super(nombre, tipoPico);
// this.tipoPico = tipoPico;
// }

// public String detalles() {
// return "Tipo de pico: " + tipoPico;
// }
// }

// // Clase para representar a los cuervos
// class Cuervo extends Ave {
// private String tipoPico;

// public Cuervo(String nombre, String tipoPico) {
// super(nombre, tipoPico);
// this.tipoPico = tipoPico;
// }

// public String detalles() {
// return "Tipo de pico: " + tipoPico;
// }
// }

// public class Main {

// public static void main(String[] args) {
// // Crear animales
// Perro perro = new Perro("Perro", "Pelo corto");
// Gato gato = new Gato("Gato", "Pelo largo");
// Leon leon = new Leon("Leon", "Melena");

// Vibora vibora = new Vibora("Vibora", true);
// Cocodrilo cocodrilo = new Cocodrilo("Cocodrilo", true);
// Lagarto lagarto = new Lagarto("Lagarto", false);

// Aguila aguila = new Aguila("Aguila", "Pico ganchudo");
// Paloma paloma = new Paloma("Paloma", "Pico corto");
// Cuervo cuervo = new Cuervo("Cuervo", "Pico afilado");
// Cuervo cuervo2 = new Cuervo("Cuervo2", "Afilado pene");

// // Crear jaulas
// JaulaTipo1 jaulaTipo1Mamiferos = new JaulaTipo1(Mamifero.class);
// JaulaTipo3 jaulaReptiles = new JaulaTipo3(Reptil.class);
// JaulaTipo2 jaulaTipo2Aves = new JaulaTipo2(Ave.class);

// // Agregar animales a las jaulas
// jaulaTipo1Mamiferos.agregarAnimal(perro);
// jaulaTipo1Mamiferos.agregarAnimal(gato);
// jaulaTipo1Mamiferos.agregarAnimal(leon);

// jaulaReptiles.agregarAnimal(vibora);
// jaulaReptiles.agregarAnimal(cocodrilo);
// jaulaReptiles.agregarAnimal(lagarto);

// jaulaTipo2Aves.agregarAnimal(aguila);
// jaulaTipo2Aves.agregarAnimal(paloma);
// jaulaTipo2Aves.agregarAnimal(cuervo);
// jaulaTipo2Aves.agregarAnimal(cuervo2);

// // Imprimir los animales en cada jaula
// System.out.println("Animales en la jaula de mamíferos:");
// jaulaTipo1Mamiferos.imprimirAnimales();
// System.out.println("\nAnimales en la jaula de reptiles:");
// jaulaReptiles.imprimirAnimales();
// System.out.println("\nAnimales en la jaula de aves:");
// jaulaTipo2Aves.imprimirAnimales();
// }
// }