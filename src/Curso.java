public class Curso {
    private String nome;
    private String instrutor;
    private int duracaoHoras;

    public Curso(String nome, String instrutor, int duracaoHoras) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.duracaoHoras = duracaoHoras;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }
}
