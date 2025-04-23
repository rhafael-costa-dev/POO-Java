package animal;

import animal.Animal;

public class Gato extends Animal {

    public Gato(String name, Integer idade) {
        super(name, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
