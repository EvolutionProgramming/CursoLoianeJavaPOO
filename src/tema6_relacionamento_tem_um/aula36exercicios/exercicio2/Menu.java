package tema6_relacionamento_tem_um.aula36exercicios.exercicio2;

import java.time.LocalTime;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nome = sc.nextLine();
        System.out.println("Digite o horário em que COMEÇA as aulas (HH:mm, ex: 19:00: ");
        String horarioInicial = sc.nextLine();
        LocalTime horarioInicio = LocalTime.parse(horarioInicial);
        System.out.println("Digite o horário em que ACABA as aulas (HH:mm, ex: 19:00): ");
        String horarioFinal = sc.nextLine();
        LocalTime horarioFim = LocalTime.parse(horarioFinal);




    }
}
