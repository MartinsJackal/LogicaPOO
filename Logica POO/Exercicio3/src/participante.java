import java.util.ArrayList;




public class participante extends compromissos {
    ArrayList <String> nomeParticipante = new ArrayList<>();
    long telefone;


    
   

    public ArrayList<String> getNomeParticipante() {
        return nomeParticipante;
    }

    public long getTelefone() {
        return telefone;
    }

    

    public void setNomeParticipante(ArrayList<String> nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }


    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }


  

    
    
    
}