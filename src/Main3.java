import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>(1);
        ArrayList<String> idade = new ArrayList<String>(1);
        for(int i=0;i<1;i++){
            System.out.printf("informe o nome: ");
            nomes.add(sc.nextLine());
            System.out.printf("informe a idade: ");
            idade.add(sc.nextLine());
        }
        for(String nome: nomes)
            System.out.println("A pessoa "+nome+ " tem "+idade+" anos!");
    }
}
