package arrays;

import lombok.Getter;

import java.util.Arrays;
@Getter
public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);

        double totalA = 0;
        for(int i = 0; i < 4; i++){
         totalA += notasAlunoA[i];
            }

        System.out.println(totalA/ notasAlunoA.length);
        double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalB = 0;
        for(int i = 0; i < 4; i++){
            totalB += notasAlunoB[i];
        }
        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(totalB / notasAlunoB.length);
    }
}