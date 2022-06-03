import java.util.ArrayList;

class compromissos{
    ArrayList <String> tipoCompromisso = new ArrayList<>();
    ArrayList <String> Data = new  ArrayList<>();
    
    

    public ArrayList<String> getData() {
        return Data;
    }
    public ArrayList<String> getTipoCompromisso() {
        return tipoCompromisso;
    }
    
    public void setData(ArrayList<String> data) {
        Data = data;
    }
    
    public void setTipoCompromisso(ArrayList<String> tipoCompromisso) {
        this.tipoCompromisso = tipoCompromisso;
    }

    
}

