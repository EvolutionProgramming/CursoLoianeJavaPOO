package tema6_relacionamento_tem_um.aula36exercicios.exercicio1;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    @Override
    public String toString() {
        return "Nome do contato: " + nome+
         " Telefone do contato: " + telefone+
         " Email do contato: " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
