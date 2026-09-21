package tema6_relacionamento_tem_um.aula36exercicios.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nome;
    private List<Contato> contatos = new ArrayList<>();

    public void criarContato(String nome, String telefone, String email) {
        if (!nome.isEmpty() && !telefone.isEmpty() && !email.isEmpty()) {
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            this.contatos.add(contato);
        }
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
