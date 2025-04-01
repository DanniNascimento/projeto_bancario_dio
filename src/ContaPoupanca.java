public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(int numero, Cliente cliente, double taxaRendimento) {
        super(numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento de " + rendimento + " aplicado na conta poupança " + getNumero());
    }

    @Override
    public String toString() {
        return "ContaPoupanca [numero=" + getNumero() + ", saldo=" + getSaldo() + ", cliente=" + getCliente().getNome() + ", taxaRendimento=" + taxaRendimento + "]";
    }
}