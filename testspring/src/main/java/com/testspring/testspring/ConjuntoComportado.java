package colecoes;

import java.util.HashSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        HashSet <String> list = new HashSet<>();
        list.add("Cicero");
        list.add("Geraldo");
        list.add("Fred");
        list.add("Werms");

        for (String candidato: list ){
            System.out.println(candidato);
        }
    }
}
