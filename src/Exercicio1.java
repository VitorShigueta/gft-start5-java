import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        ArrayList<Double> valoresfinais = new ArrayList<>();
        double[] parcelas =  {1, 6, 12, 18, 24, 30};
        for(int i = 0; i <= 30; i += 6){
            if(i == 0) {
                valoresfinais.add(valor - ( (valor / 100) * 20));
            }else{
                valoresfinais.add(valor + (valor / 100) * i / 2);
            }
        }

        System.out.print("Preço final |");
        System.out.print("Quantidade de parcelas | ");
        System.out.println("Valor da parcela");

        for (int i = 0; i < 6; i++){
            System.out.print(valoresfinais.get(i) + "  | ");
            System.out.print(parcelas[i] + "  | ");
            double valorParcela = valoresfinais.get(i) / parcelas[i];
            String resultado = String.format("%.2f", valorParcela);
            System.out.println(resultado);
        }
    }
}
