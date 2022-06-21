package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> list = new ArrayList<>();
            Usuario u1 = new Usuario("Ana");
            list.add(u1);

            list.add(new Usuario("Cicero"));
            list.add(new Usuario("João"));
            list.add(new Usuario("Tey"));
            list.add(new Usuario("Salve"));

        System.out.println(list.contains(new Usuario("Cicero")));
        System.out.println(list.get(3));


            for(Usuario u: list){
                System.out.println("Meu nome é: " + u.getNome());
            }
    }
}
