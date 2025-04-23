package animal;

public class Animal {

    private String name;
    private Integer idade;

    public Animal(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}