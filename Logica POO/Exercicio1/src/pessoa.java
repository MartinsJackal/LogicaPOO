import java.util.Calendar;
import java.util.GregorianCalendar;

public class pessoa {
    //Variaveis
    private String nome;
    private int anoNascimento;
    private float altura;
    //Fim Variaveis
    //Getters e Setters
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setAnoNascimento(int dataNascimento) {
        this.anoNascimento = dataNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getAltura() {
        return altura;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    //Fim Getters e Setters
    //Metodo para calcular a idade.
    public int calculaIdade(){
        GregorianCalendar hj = new GregorianCalendar();
        int anohj = hj.get(Calendar.YEAR);
        return (anohj - anoNascimento);
    }

        
}
