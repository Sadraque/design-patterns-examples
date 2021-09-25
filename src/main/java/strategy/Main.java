package strategy;

public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao(1L, 100);

        mostrarJuros(new SantanderBanco(), operacao);
        mostrarJuros(new InterBanco(), operacao);
    }

    public static void mostrarJuros(BancoStrategy banco, Operacao operacao) {
        System.out.println(String.format("BANCO: %s", banco.getClass()));
        System.out.println(String.format("VALOR: %.2f", operacao.getValor()));
        System.out.println(String.format("JUROS: %.2f", banco.calcularJuros(operacao)));
    }
}
