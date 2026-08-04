package tema3_construtores_this_encapsulamento_overload.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();

        //inteiro
        calculadora.soma(1,2);
        //double
        calculadora.soma(1.0,2.0);

    }
}
