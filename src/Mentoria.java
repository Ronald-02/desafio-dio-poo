import java.time.LocalDateTime;

public class Mentoria {
    private String tema;
    private LocalDateTime horario;
    private int duracaoMinutos;

    public Mentoria(String tema, LocalDateTime horario, int duracaoMinutos) {
        this.tema = tema;
        this.horario = horario;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTema() {
        return tema;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
