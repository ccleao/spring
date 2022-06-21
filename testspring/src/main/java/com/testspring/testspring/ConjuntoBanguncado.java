package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBanguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Test"); //String
        conjunto.add(1); //int -> Integer
        conjunto.add('x'); // conversão automática

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Test");
        conjunto.add("test");

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.remove(1.2);

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains("Test"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);

        System.out.println();

        System.out.println(conjunto);
        System.out.println();

        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
