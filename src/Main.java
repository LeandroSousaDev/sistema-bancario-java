import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cliente venilson = new Cliente();

        // venilton.setNome("Venilton");
        // venilson.setNome("venilson");

        // Conta cliente1 = new ContaCorrente(venilson);
        // Conta cliente2 = new ContaCorrente(venilton);

        // cliente1.transferir(100, cliente2);
        // cliente1.depositar(100);

        // cliente1.imprimirExtrato();
        // cliente2.imprimirExtrato();

        int opcao = 0;
        Cliente cliente = new Cliente();
        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);
        Conta pessoa = new ContaCorrente(cliente);

        String menu1 = """
                *** Digite a Opção ***
                1 - criar Conta;
                6 - Sair;
                """;

        String menu = """
                 *** Digite a Opção ***
                 2 - Depositar;
                 3 - Transferir;
                 4 - Sacar;
                 5 - Extrato;
                 6 - sair;
                """;

        System.out.println("Digite o nome do titular");
        cliente.setNome(leitura.nextLine());

        while (opcao != 6) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 2) {
                System.out.println("digite o valor a depositar:\n");
                double valor = leitura.nextDouble();

                pessoa.depositar(valor);

            } else if (opcao == 3) {
                System.out.println("digite o valor a transferir:\n");
                double valor = leitura.nextDouble();

                System.out.println("digite o numero da conta destino\n");
                String destinatario = leitura.nextLine();

                pessoa.transferir(valor, destinatario);

            } else if (opcao == 4) {
                System.out.println("digite o valor a trasnferir:\n");
                double valor = leitura.nextDouble();

                pessoa.sacar(valor);

            } else if (opcao == 5) {
                pessoa.imprimirExtrato();

            } else if (opcao != 6) {
                System.out.println("Opção Invalida");
            }
        }

    }
}