public class Conta implements IConta {

    private static final int agenciaPadrao = 1;

    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.agenciaPadrao;

        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, String contaDestino) {
        this.sacar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }
}
