import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                // Criando um bootcamp
                Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento Web");

                // Criando cursos
                Curso cursoJava = new Curso("Java POO", "Luiz Silva", 40);
                Curso cursoReact = new Curso("React Avançado", "Ana Clara", 30);
                bootcamp.adicionarCurso(cursoJava);
                bootcamp.adicionarCurso(cursoReact);

                // Criando mentorias
                LocalDateTime horarioMentoria1 = LocalDateTime.of(2024, 6, 27, 14, 0); // Exemplo de horário específico
                Mentoria mentorship1 = new Mentoria("Carreira em TI", horarioMentoria1, 60);

                LocalDateTime horarioMentoria2 = LocalDateTime.of(2024, 6, 28, 15, 30); // Exemplo de horário específico
                Mentoria mentorship2 = new Mentoria("Técnicas de Entrevista", horarioMentoria2, 45);

                bootcamp.adicionarMentoria(mentorship1);
                bootcamp.adicionarMentoria(mentorship2);

                // Criando devs participantes
                Dev dev1 = new Dev("Mariana Souza", "Back-end");
                Dev dev2 = new Dev("Yuri Lima", "Front-end");
                bootcamp.adicionarDev(dev1);
                bootcamp.adicionarDev(dev2);

                // Exemplo de utilização: listar cursos oferecidos pelo bootcamp
                System.out.println("Cursos oferecidos pelo Bootcamp:");
                List<Curso> cursosOferecidos = bootcamp.getCursosOferecidos();
                for (Curso curso : cursosOferecidos) {
                    System.out.println(curso.getNome() + " - Instrutor: " + curso.getInstrutor() +
                            " - Duração: " + curso.getDuracaoHoras() + " horas");
                }

                // Exemplo de utilização: listar mentorias disponíveis
                System.out.println("\nMentorias disponíveis no Bootcamp:");
                List<Mentoria> mentoriasDisponiveis = bootcamp.getMentoriasDisponiveis();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                for (Mentoria mentoria : mentoriasDisponiveis) {
                    String formattedHorario = mentoria.getHorario().format(formatter);
                    System.out.println(mentoria.getTema() + " - Horário: " + formattedHorario +
                            " - Duração: " + mentoria.getDuracaoMinutos() + " minutos");
                }

                // Exemplo de utilização: listar devs participantes
                System.out.println("\nDevs participantes no Bootcamp:");
                List<Dev> devsParticipantes = bootcamp.getDevsParticipantes();
                for (Dev dev : devsParticipantes) {
                    System.out.println(dev.getNome() + " - Especialidade: " + dev.getEspecialidade());
                }
            }
        }
