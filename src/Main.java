import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>(2);
        while (true) {
            System.out.println("Informe um nome a ser adicionado");
            String nome = sc.nextLine();
            if (!nome.equals("")) {
                nomes.add(nome);
            } else break;
        }
        System.out.println(nomes.toString());

    }
}