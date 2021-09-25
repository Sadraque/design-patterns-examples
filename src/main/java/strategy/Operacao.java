package strategy;

public class Operacao {
    private Long id;
    private double valor;

    public Operacao(Long id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
