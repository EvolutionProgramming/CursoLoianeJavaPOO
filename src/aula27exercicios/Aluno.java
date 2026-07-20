package aula27exercicios;

import java.util.Objects;

public class Aluno {
    String nome;
    String curso;
    String disciplinas[];
    int numeroMatricula;
    double notas[];

    boolean conferirMeusDados(String nomeInformado, int matriculaInformada) {
        return (Objects.equals(this.nome, nomeInformado) && this.numeroMatricula == matriculaInformada);
    }

    boolean validarAprovacao(double nota) {
        return nota >= 7;
    }


}
