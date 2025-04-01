public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " realizado na conta " + this.numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta " + this.numero);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " da conta " + this.numero + " para a conta " + contaDestino.getNumero() + " realizada.");
            return true;
        }
        return false;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]";
    }
}