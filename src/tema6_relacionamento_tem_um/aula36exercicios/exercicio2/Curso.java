package tema6_relacionamento_tem_um.aula36exercicios.exercicio2;

import java.time.LocalTime;

public class Curso {
    private String nome;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;

    public void criarCurso(String nome, LocalTime horarioInicial, LocalTime horarioFinal) {
        setNome(nome);
        setHorarioInicio(horarioInicial);
        setHorarioFim(horarioFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }
}
