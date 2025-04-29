import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o valor do seu salario: ");
        Double salario = scan.nextDouble();
        System.out.print("Quanto vc recebe de adicional: ");
        Double adcional =  scan.nextDouble();

        double imposto = taxar(salario);

        double salarioFInal = (salario - imposto + adcional);

        System.out.println("O salario final: " +salarioFInal);

    }

    public static double taxar(double valor){
        if (valor<=1100) {
            Double impostosobreovalor= 0.05*valor;
            return impostosobreovalor;
        }
        if (1100<valor && valor<=2500) {
            Double impostosobreovalor = 0.10*valor;
            return impostosobreovalor;
        }
        if (valor>2500) {
            Double impostosobreovalor = 0.15*valor;
            return impostosobreovalor;
        }
        return valor;
    }

}
