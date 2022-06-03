import java.util.Scanner;

/*. O agendamento de compromissos é uma das tarefas mais comuns para profissionais. Um sistema com essa 
finalidade deve ser capaz de gerenciar compromissos, atribuindo a cada um o seu tipo (reunião, pagamento, 
entrega de projeto); data; nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o 
compromisso) e seu telefone. Desenvolva um sistema que seja capaz de fazer operações básicas como 
agendar, remover e alterar compromissos e exibir compromissos por participante e por data.*/

public class App {
    public static void main(String[] args) throws Exception {
        int opcao,i;
        agendador agenda = new agendador();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Bem vindo!!");

        System.out.printf("O que gostaria de fazer\n\t1-Agendar um compromisso\n\t2-Desmarcar um compromisso\n\t3-Alterar um compromisso\n\t4-Exibir compromissos\n\t5-Sair\n");
        opcao = in.nextInt();
        while(opcao <= 4 && opcao > 0){
            switch(opcao){
                case 1://Agendar um compromisso
                    agenda.agendar();
                break;
                case 2://Desmarcar um compromisso
                    agenda.desmarcar();
                    break;
                case 3://Alterar um compromisso
                    agenda.alterar();
                    break;
                case 4://Exibir todos os compromissos
                    agenda.exibir();
                    break;
                default://Sair
                System.out.println("Okay até a proxima!");
            }

            System.out.printf("\nGostaria de realizar outra tarefa? 1-Sim 2-Não\n");
            i = in.nextInt(); 
            if(i == 1){
                System.out.printf("\nO que gostaria de fazer\n\t1-Agendar um compromisso\n\t2-Desmarcar um compromisso\n\t3-Alterar um compromisso\n\t4-Exibir compromissos\n\t5-Sair\n");
                opcao = in.nextInt();
            }else{
                opcao = 5;
                System.out.println("\nOkay até a proxima!");
            }
            
        }

      

        in.close();
       
    }
}
