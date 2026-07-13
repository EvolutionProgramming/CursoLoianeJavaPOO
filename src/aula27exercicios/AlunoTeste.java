package aula27exercicios;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Otávio";
        aluno1.curso = "História";
        aluno1.disciplinas = new String[]{"Idade Média", "Idade Moderna", "Idade Contemporânea"};
        aluno1.notas = new double[]{7.5, 6.5, 9};
        aluno1.numeroMatricula = 12399;

        System.out.println("-----------------------------------------------------");
        System.out.println("Deseja consultar a nota de algum aluno? (Digite 1 para inciar ou digite qualquer coisa pra sair)");
        int comando = sc.nextInt();
        sc.nextLine();

        while (aluno1.validarComando(comando)) {

            System.out.println("-----------------------------------------------------");
            System.out.println("Digite o nome do aluno:");
            String nomeInformado = sc.nextLine();
            System.out.println("-----------------------------------------------------");
            System.out.println("Digite o número de matrículo do aluno:");
            int matriculaInformada = sc.nextInt();
            sc.nextLine();

            if (aluno1.validarNomeMatricula(nomeInformado, matriculaInformada)) {
                for (int cont = 0; cont < aluno1.disciplinas.length; cont++) {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Nota da disciplina de " + aluno1.disciplinas[cont] + ": " + aluno1.notas[cont]);
                    aluno1.validarAprovacao(aluno1.notas[cont]);
                }
                comando = 0;
            } else {
                System.out.println("-----------------------------------------------------");
                System.out.println("Informações não constam no sistema. Finalizando...");
                System.exit(0);
            }
        }
        sc.close();

    }
}
