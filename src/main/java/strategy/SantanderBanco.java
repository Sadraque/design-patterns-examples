package strategy;

public class SantanderBanco implements BancoStrategy{

    @Override
    public double calcularJuros(Operacao operacao) {

        return operacao.getValor() * 0.01;
    }
}
