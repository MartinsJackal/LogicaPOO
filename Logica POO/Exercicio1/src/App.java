import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        pessoa p = new pessoa();//Instanciando o objeto p do tipo pessoa
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        p.setNome(scan.nextLine());
        System.out.println("Digite sua altura:");
        p.setAltura(scan.nextFloat());
        System.out.println("Digite seu ano de nascimento:");
        p.setAnoNascimento(scan.nextInt());

        System.out.println("Nome: " + p.getNome());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Data de Nascimento: " + p.getAnoNascimento());
        System.out.println("Idade:" + p.calculaIdade());
    }
}
