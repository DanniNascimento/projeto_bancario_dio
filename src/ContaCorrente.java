public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, Cliente cliente, double limiteChequeEspecial) {
        super(numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial >= valor)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado na conta corrente " + getNumero());
            return true;
        } else {
            System.out.println("Saldo insuficiente ou limite do cheque especial excedido.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente [numero=" + getNumero() + ", saldo=" + getSaldo() + ", cliente=" + getCliente().getNome() + ", limiteChequeEspecial=" + limiteChequeEspecial + "]";
    }
}