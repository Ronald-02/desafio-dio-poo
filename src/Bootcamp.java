import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private List<Curso> cursosOferecidos;
    private List<Mentoria> mentoriasDisponiveis;
    private List<Dev> devsParticipantes;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursosOferecidos = new ArrayList<>();
        this.mentoriasDisponiveis = new ArrayList<>();
        this.devsParticipantes = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursosOferecidos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentoriasDisponiveis.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devsParticipantes.add(dev);
    }

    public List<Curso> getCursosOferecidos() {
        return cursosOferecidos;
    }

    public List<Mentoria> getMentoriasDisponiveis() {
        return mentoriasDisponiveis;
    }

    public List<Dev> getDevsParticipantes() {
        return devsParticipantes;
    }
}
