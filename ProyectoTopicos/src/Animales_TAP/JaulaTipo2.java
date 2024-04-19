package Animales_TAP.Animal;

public class JaulaTipo2 extends Jaula {
    private Class<? extends Ave> tipoAve;

    public JaulaTipo2(Class<? extends Ave> tipoAve) {
        super();
        this.tipoAve = tipoAve;
    }

    public void agregarAnimal(Animal animal) {
        if (tipoAve.isInstance(animal)) {
            animales.add(animal);
        } else {
            System.out.println("Este tipo de jaula solo acepta animales del tipo " + tipoAve.getSimpleName());
        }
    }
}
