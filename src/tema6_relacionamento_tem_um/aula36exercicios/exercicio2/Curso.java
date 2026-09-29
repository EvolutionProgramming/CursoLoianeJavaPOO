package tema6_relacionamento_tem_um.aula36exercicios.exercicio2;

import java.time.LocalTime;

public class Curso {
    private String nome;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;


    public String getNome() {
        return nome;
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
