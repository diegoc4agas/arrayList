import java.util.ArrayList;
import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>(2);
        nomes.add("Diego");nomes.add("Leona");nomes.add("Caique");nomes.set(1,"Luiz");
        System.out.println(nomes.toString());
        System.out.println(nomes.indexOf("rod"));
    }
}
