package aula27exercicios;

import java.util.Objects;

public class Aluno {
    String nome;
    String curso;
    String disciplinas[];
    int numeroMatricula;
    double notas[];

    boolean validarComando(int comando) {
        return comando == 1;
    }

    boolean validarNomeMatricula(String nomeInformado, int matriculaInformada) {
        return (Objects.equals(this.nome, nomeInformado) && this.numeroMatricula == matriculaInformada);
    }

    void validarAprovacao(double nota) {
        if (nota >= 7) {
            System.out.println("APROVADO!!!");
        } else {
            System.out.println("REPROVADO!!!");
        }
    }


}
