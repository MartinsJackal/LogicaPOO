import java.util.Scanner;

class agendador {

    compromissos comp = new compromissos();
    participante part = new participante();
    String tmpParticipante,tmpData;
    Scanner in = new Scanner(System.in);
    int i;

    public void agendar(){
        System.out.println("Qual o tipo de compromisso?");
        comp.tipoCompromisso.add(in.nextLine());
        System.out.println("Insira o nome do participante empresa ou Pessoa:");
        tmpParticipante = in.nextLine();
        if(part.nomeParticipante.contains(tmpParticipante)){//Verifica se o nome já se encontra na base de dados
            System.out.println("Insira a data do Evento:");//Se sim, não insere o nome novamente
            comp.Data.add(in.nextLine());//Insere a data na base de Dados
        }else{//Caso o nome não seja encontrado na base de dados, o insere e logo em seguida insere a Data
            part.nomeParticipante.add(tmpParticipante);
            System.out.println("Insira a data do Evento:");
            comp.Data.add(in.nextLine());
        }
        
        System.out.printf("Evento agendado com sucesso na data de %s\n",comp.Data.get(i));
        i++; 
    } 

    public void desmarcar(){
        System.out.println("Em que nome está o evento?");
        tmpParticipante = in.nextLine();//Armazena o nome em uma variavel temporaria para facilitar o comparativo
        while(!part.nomeParticipante.contains(tmpParticipante)){
            System.out.println("Não há eventos ligados a este nome na base!Favor inserir um nome válido");
            tmpParticipante = in.nextLine();
        }    
            System.out.println("Qual a data do evento");//Pergunta a data a ser desmarcada
            tmpData = in.nextLine();//Armazenaa a Data em uma variavel temporaria para facilitar o comparativo
        while(!comp.Data.contains(tmpData)){
            System.out.println("Não existe eventos nesta data ligados a esse nome!Favor inserir uma data válida");
            tmpData = in.nextLine();
        }
            //Se a Data existir a remove da base de dados
            comp.Data.removeIf(d -> d.contains(tmpData));
            System.out.println("Evento desmarcado!!");

    }


    public void alterar(){
        System.out.println("Em que nome está o evento?");
        tmpParticipante = in.nextLine();//Armazenaa o Participante em uma variavel temporaria para facilitar o comparativo
        while(!part.nomeParticipante.contains(tmpParticipante)){//Enquanto o usuário não digitar um nome valido,repita
            System.out.println("Não existe ninguem com este nome na base favor inserir um nome válido.");
            tmpParticipante = in.nextLine();
        }
            System.out.println("Qual a data do evento a ser alterado?");
            tmpData = in.nextLine();//Armazenaa a Data em uma variavel temporaria para facilitar o comparativo
            while(!comp.Data.contains(tmpData)){//Enquanto o usuário não digitar uma data valida,repita
                System.out.println("Esta data não existe para esta pessoa,favor inserir uma data válida.");
                tmpData = in.nextLine();
            }
                comp.Data.removeIf(d -> d.contains(tmpData));//Se existir remove a Data
                System.out.println("Insira a nova data do Evento:");
                tmpData = in.nextLine();//Insere uma nova data no lugar da antiga
                comp.Data.add(tmpData);
                System.out.printf("Evento reagendado para %s",tmpData);
            
        }


    public void exibir(){
        int i,o;
        System.out.printf("Exibir compromissos:\n\t1-Por Data\n\t2-Por Participante\n");
        i = in.nextInt();
        
        do{
            if(i == 1){
                System.out.println(comp.Data);//Exibe a lista ordenado pela data
                System.out.println(comp.tipoCompromisso);
            }else{
                System.out.println(part.nomeParticipante);//Exibe a lista ordenado pelos participantes
                System.out.println(comp.tipoCompromisso);
            }   
            System.out.println("Exibir outros compromissos?");
            o = in.nextInt();
        }while((o != 2));//repita até  o cliente pedir para sair
        
    }
}

