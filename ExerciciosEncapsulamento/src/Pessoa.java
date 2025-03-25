import com.sun.jdi.request.StepRequest;

public class Pessoa {
    private String name;
    private Integer idade;
    private String genero;

    public String getName() {
        return name;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getGenero() {
        return genero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(Integer idade) {
        if (idade >= 0)
            this.idade = idade;
    }

    public void setGenero(String genero) {
        if (isGeneroValido(genero))
            this.genero = genero;
    }

    private boolean isGeneroValido(String genero) {
        return "masculino".equalsIgnoreCase(genero) ||
                "feminino".equalsIgnoreCase(genero) ||
                "não-binário".equalsIgnoreCase(genero);

    }

}
