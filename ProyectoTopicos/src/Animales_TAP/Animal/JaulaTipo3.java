package Animales_TAP.Animal;

public class JaulaTipo3 extends Jaula {
    private Class<? extends Reptil> tipoReptil;

    public JaulaTipo3(Class<? extends Reptil> tipoReptil) {
        super();
        this.tipoReptil = tipoReptil;
    }

    @Override
    public void agregarAnimal(Animal animal) {
        if (animal.getClass().getSuperclass().equals(tipoReptil)) {
            animales.add(animal);
        } else {
            System.out.println("Este tipo de jaula solo acepta reptiles del tipo " + tipoReptil.getSimpleName());
        }
    }
}
