package tema6_relacionamento_tem_um.aula36exercicios.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comando = -1;
        String nomeAgenda;

        do {
            System.out.println("Digite o nome da agenda: (Não é permitido nome vazio)");
            nomeAgenda = sc.nextLine();
            espacarLinhas();

        } while (nomeAgenda.isEmpty());

        Agenda agenda = new Agenda();
        agenda.setNome(nomeAgenda);
        do {

            mostrarMenu();
            espacarLinhas();
            //adicionar try catch
            comando = Integer.parseInt(sc.nextLine());

            processarOpcao(comando, sc, agenda);

        } while (comando != 0);
    }

    public static void mostrarMenu() {
        System.out.println("          MENU PRINCIPAL");
        System.out.println("------------------------------------");
        System.out.println("Digite 1 para criar 3 contatos (Se ja existem, entao substitui os outros)");
        System.out.println("Digite 2 para mostrar contatos");
        System.out.println("------------------------------------");
    }

    public static void processarOpcao(int comando, Scanner sc, Agenda agenda) {

        switch (comando) {

            case 1:
                for (int cont = 1; cont < 4; cont++) {
                    System.out.println("Digite o nome do " + cont + "° contato: ");
                    String nomeContato = sc.nextLine();
                    System.out.println("Digite o telefone do contato: ");
                    //adicionar try catch
                    String telefoneContato = sc.nextLine();
                    System.out.println("Digite o email do contato: ");
                    String emailContato = sc.nextLine();

                    agenda.criarContato(nomeContato, telefoneContato, emailContato);
                }
                break;

            case 2:
                List<Contato> contatos = agenda.getContatos();

                if (contatos != null && !contatos.isEmpty()) {
                    for (Contato c : contatos) {
                        System.out.println(c);
                        espacarLinhas();
                    }
                } else {
                    System.out.println("Lista de contatos vazia");
                    espacarLinhas();
                }
                break;
            case 0:
                break;

            default:
                System.out.println("Digite uma opção válida!!!");
                espacarLinhas();
                break;
        }

    }


    public static void espacarLinhas() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
}
