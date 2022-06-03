import java.util.Scanner;

class contaCorrente {
    private int numConta;
    private String nomeCorrentista;
    private float saldo,saque,deposito;
    Scanner in = new Scanner(System.in);
    Scanner inN = new Scanner(System.in);

    
    public int getNumConta(){
        return numConta;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public void setNomeCorrentista(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
    }
    public void setSaldo(float saldo){
        
            this.saldo = saldo;
        
    }

    public String alterarNome(){
        System.out.println("\nDigite o novo nome de Correntista:");
        setNomeCorrentista(in.nextLine());
        System.out.printf("\nNome alterado com sucesso!\nO novo nome da conta corrente é %s\n",nomeCorrentista);
        return nomeCorrentista;
    }

    public float saque(){
        System.out.println("\nQuanto você gostaria de sacar?");
        this.saque = inN.nextFloat();
        saldo = saldo - saque;
        System.out.printf("\nO valor de %.2f foi sacado com sucesso,seu novo saldo é: %.2f\n",saque,saldo);
        return saldo;
    }

    public float depositar(){
        System.out.println("\nQuanto você gostaria de Depositar?\n");
        this.deposito = inN.nextFloat();
        saldo = saldo + deposito;
        System.out.printf("\nO valor de %.2f foi depositado com sucesso, seu novo saldo é: %.2f\n",deposito,saldo);
        return saldo;
    }
    
}
