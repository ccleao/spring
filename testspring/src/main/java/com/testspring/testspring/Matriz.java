package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos ? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno ? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for(int i = 0; i < qtdeAlunos; i++) {
            for (int n = 0; n < qtdeNotas; n++){

                System.out.printf("Informe a nota do aluno %d do aluno %d: ", i +1, n +1);
                notasDaTurma[i][n] = entrada.nextDouble();
                total += notasDaTurma[i][n];
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é: " + media);

        for(double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        entrada.close();
    }
}
