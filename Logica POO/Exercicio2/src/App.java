import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        contaCorrente conta = new contaCorrente();
        Scanner in = new Scanner(System.in);
        int opcao;

        System.out.println("Preencha seu nome:");
        conta.setNomeCorrentista(in.nextLine());
        System.out.println("Preencha sua conta:");
        conta.setNumConta(in.nextInt());
        System.out.println("Preencha seu saldo:");
        conta.setSaldo(in.nextFloat());
        System.out.printf("\n \nNome do correntista: %s\nNumero da Conta:%d\nSaldo da conta:%.2f\n\n" , conta.getNomeCorrentista(),conta.getNumConta(),conta.getSaldo());
        System.out.printf("O que você gostaria de fazer com essas informações?\n1-Alterar nome do correntista\n2-Sacar\n3-Depositar\n4-Sair\n");
        opcao = in.nextInt();
        
        while(opcao == 1 || opcao == 2 || opcao == 3){
            switch(opcao){
                case 1:
                conta.alterarNome();
                break;
                case 2:
                conta.saque();
                break;
                case 3:
                conta.depositar();
                break;
                default:
            }
            System.out.printf("\nGostaria de realizar outra operação?\n1-Alterar nome do correntista\n2-Sacar\n3-Depositar\n4-Sair\n");
            opcao = in.nextInt();
        }
        System.out.printf("\n \nNome do correntista: %s\nNumero da Conta:%d\nSaldo da conta:%.2f\n\n" , conta.getNomeCorrentista(),conta.getNumConta(),conta.getSaldo());
        in.close();
    }
}
