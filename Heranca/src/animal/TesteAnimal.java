package animal;

public class TesteAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal("Cavalo", 10);
        Animal gato = new Gato("Cavalo", 10);
        Animal cachorro = new Cachorro("Cavalo", 10);

        animal.fazerSom();
        gato.fazerSom();
        cachorro.fazerSom();
    }

}
