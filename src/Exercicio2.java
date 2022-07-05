import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunosReprovados = 0;
        int alunosReprovadosFrequencia = 0;
        ArrayList<Integer> matricula = new ArrayList<>();
        ArrayList<Double> notasFinais = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();
        double maiorNota = -1;
        double menorNota = 10;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o Aluno:");
            int aluno = sc.nextInt();
            matricula.add(aluno);

            System.out.println("Primeira nota");
            double nota1 = sc.nextDouble();

            System.out.println("Segunda nota");
            double nota2 = sc.nextDouble();

            System.out.println("Terceira nota");
            double nota3 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;
            notasFinais.add(media);

            System.out.println("Frequencia");
            double frequenciaAulas = sc.nextDouble();
            System.out.println("total de aulas");
            double aulas = sc.nextDouble();
            double frequencia = (frequenciaAulas / aulas) * 10;
            System.out.println(frequencia);

            if (frequencia < 7) {
                status.add("Reprovavdo");
                alunosReprovadosFrequencia++;
                System.out.println(alunosReprovadosFrequencia);
                alunosReprovados++;
            }else if(media < 6){
                status.add("Reprovado");
                alunosReprovados++;
            } else{
                status.add("Aprovado");
            }

            if(media > maiorNota){
                maiorNota = media;
            }
            if(media < menorNota){
                menorNota = media;
            }
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Matricula:" + matricula.get(i));
            System.out.println("Nota final" + notasFinais.get(i));
            System.out.println("Mensagem: " + status.get(i));
            System.out.println("---------------------");
        }

        System.out.println("A maior nota foi:" + maiorNota);
        System.out.println("A menor nota foi:" + menorNota);

        System.out.println("Alunos reprovados: " + alunosReprovados);



        System.out.println("Alunos reprovador por frequência:" + (alunosReprovadosFrequencia * 2 * 10) + "%");
    }
}
