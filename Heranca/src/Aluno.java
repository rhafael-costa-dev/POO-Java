public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println(String.format("Olá! Meu nome é %s tenho %d anos!\nMinha matricula é %s", super.getNome(), super.getIdade(), this.matricula));
    }
}
