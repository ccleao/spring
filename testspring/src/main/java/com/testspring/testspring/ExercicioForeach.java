package arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {

        double[] notasAlunoA = {7.9, 8, 6.7, 9.7};

        for(double nota: notasAlunoA) {
            System.out.print(nota + " ");
        }
        System.out.println();

        double[] notasAlunoB = {6.9, 8.9, 5.9, 10};

        for(double nota: notasAlunoB) {
            System.out.print(nota + " ");
        }
    }
}