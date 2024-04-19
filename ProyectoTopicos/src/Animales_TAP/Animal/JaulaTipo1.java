package Animales_TAP.Animal;

public class JaulaTipo1 extends Jaula {
    private Class<? extends Mamifero> tipoMamifero;

    public JaulaTipo1(Class<? extends Mamifero> tipoMamifero) {
        super();
        this.tipoMamifero = tipoMamifero;
    }

    public void agregarAnimal(Animal animal) {
        if (tipoMamifero.isInstance(animal)) {
            animales.add(animal);
        } else {
            System.out.println("Este tipo de jaula solo acepta animales del tipo " + tipoMamifero.getSimpleName());
        }
    }
}
