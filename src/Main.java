public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Danni Nascimento", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Das Dores", "987.654.321-11");

        ContaCorrente cc1 = new ContaCorrente(1001, cliente1, 1000.0);
        ContaPoupanca cp1 = new ContaPoupanca(2001, cliente2, 0.05);

        Banco banco = new Banco("Meu Banco");
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

        banco.listarContas();

        cc1.depositar(500.0);
        cp1.depositar(1000.0);

        banco.listarContas();

        cc1.transferir(cp1, 200.0);

        banco.listarContas();

        cp1.aplicarRendimento();

        banco.listarContas();
    }
}