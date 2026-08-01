package aula33a28exercicios;

public class Alunov2 {
    private String nome;
    private String curso;
    private  String[] disciplinas;
    private int numeroMatricula;
    private double[] notas;

    public Alunov2(String nome, String curso, String[] disciplinas, int numeroMatricula, double[] notas) {
        if (disciplinas.length != notas.length) {
            throw new IllegalArgumentException("A quantidade de disciplinas deve ser igual à quantidade de notas.");
        }

        this.nome = nome;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.numeroMatricula = numeroMatricula;
        this.notas = notas;
    }

    public boolean conferirMeusDados(String nomeInformado, int matriculaInformada) {
        return this.nome.equalsIgnoreCase(nomeInformado) && (this.numeroMatricula == matriculaInformada);
    }

    public boolean validarAprovacao(double nota) {
        return nota >= 7;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }


    public double[] getNotas() {
        return notas;
    }


}
