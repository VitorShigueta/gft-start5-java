import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        double votosBrancos = 0;
        double votosNulosSobreTotal = 0;
        double votosBrancosSobreTotal = 0;
        int contador = 1;
        double totalVotos = 0;

        while(contador != 0) {
            System.out.println("Faça seu voto");
            int voto = sc.nextInt();
            contador = voto;
            if (voto == 1) {
                candidato1++;
            }
            if (voto == 2) {
                candidato2++;
            }
            if (voto == 3) {
                candidato3++;
            }
            if (voto == 4) {
                candidato4++;
            }
            if (voto == 5) {
                votosNulos++;
            }
            if (voto == 6) {
                votosBrancos++;
            }
            if (contador != 0){
                totalVotos++;
            }
        }

        votosBrancosSobreTotal = ((votosBrancos / 100) * totalVotos) * 1000;
        votosNulosSobreTotal = ((votosBrancos / 100) * totalVotos) * 1000;

        System.out.println("Cantidato 1:" + candidato1);
        System.out.println("Cantidato 2:" + candidato2);
        System.out.println("Cantidato 3:" + candidato3);
        System.out.println("Cantidato 4:" + candidato4);
        System.out.println("Votos nulos:" + votosNulos);
        System.out.println("Votos brancos:" + votosBrancos);
        System.out.println("Votos nulos sobre total de votos:" + votosNulosSobreTotal + "%" );
        System.out.println("Votos brancos sobre o total" + votosBrancosSobreTotal + "%");

    }

}
