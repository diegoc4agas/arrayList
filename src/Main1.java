import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>(1);
        nomes.add("Diego");
        nomes.add("Leona");
        nomes.add("Caique");
        nomes.add("Luiz");
        nomes.add("Fernando");
        nomes.add("Felipe");
        nomes.add("Caio");
        nomes.add("Paulo");
        nomes.add("Luana");
        nomes.add("Caique");
        for(String nome: nomes){
            System.out.println("Bem vindo, " +nome+"!");
        }

    }
}
