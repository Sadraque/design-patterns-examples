package strategy;

public class InterBanco implements BancoStrategy{

    @Override
    public double calcularJuros(Operacao operacao) {

        return operacao.getValor() * 0.1;
    }
}
