package tema3_construtores_this_encapsulamento_overload.aula33a28exercicios;

import java.util.Scanner;

public class AlunoTestev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alunov2 aluno1 = new Alunov2(
                "Otávio",
                "História",
                new String[]{"Idade Média", "Idade Moderna", "Idade Contemporânea"},
                12399,
                new double[]{7.5, 6.5, 9.0}
        );


        System.out.println("-----------------------------------------------------");
        System.out.println("Deseja consultar a nota de algum aluno? (Digite 1 para inciar ou digite qualquer coisa pra sair)");
        int comando = sc.nextInt();
        sc.nextLine();

        while (validarComando(comando)) {

            System.out.println("-----------------------------------------------------");
            System.out.println("Digite o nome do aluno:");
            String nomeInformado = sc.nextLine();
            System.out.println("-----------------------------------------------------");
            System.out.println("Digite o número de matrícula do aluno:");
            int matriculaInformada = sc.nextInt();
            sc.nextLine();

            if (aluno1.conferirMeusDados(nomeInformado, matriculaInformada)) {
                exibirInformacoes(aluno1);
                comando = 0;
            } else {
                System.out.println("-----------------------------------------------------");
                System.out.println("Informações não constam no sistema. Finalizando...");
                break;
            }
        }
        sc.close();

    }

    private static boolean validarComando(int comando) {
        return comando == 1;
    }

    private static void exibirInformacoes(Alunov2 aluno) {
        for (int cont = 0; cont < aluno.getDisciplinas().length; cont++) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Nota da disciplina de " + aluno.getDisciplinas()[cont] + ": " + aluno.getNotas()[cont]);
            boolean resultado = aluno.validarAprovacao(aluno.getNotas()[cont]);
            if (resultado) {
                System.out.println("APROVADO!!!");
            } else {
                System.out.println("REPROVADO!!!");
            }
        }
    }
}