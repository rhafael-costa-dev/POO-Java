public class Livro {
    private Long ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private Integer numeroPaginas;

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void parse(String dados) {
        String[] infos = dados.split(";");

        ISBN = Long.parseLong(infos[0]);
        titulo = infos[1];
        autor = infos[2];
        genero = infos[3];
        numeroPaginas = Integer.parseInt(infos[4]);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
