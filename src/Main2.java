import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>(4);
        for(int i=0;i<4;i++){
            System.out.printf("informe o próximo nome: ");
            nomes.add(sc.nextLine());
        }
        for(String nome: nomes)
            System.out.println("Bem vindo: "+nome);
    }
}
