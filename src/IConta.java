public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, String contaDestino);

    void imprimirExtrato();
}
