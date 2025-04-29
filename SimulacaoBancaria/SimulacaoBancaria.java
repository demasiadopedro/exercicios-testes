import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = 0;
        boolean continuar = true;
        System.out.println("BEM-VINDO, AO SIMULADOR DE COMTA BANCARIA");
        

        while (continuar) {
            System.out.println("DIGITE");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar o saldo");
            System.out.println("4- Encerrar");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("voce deseja depositat quamto: ");
                    double deposito = scan.nextDouble();
                    saldo = deposito+saldo;
                    System.out.println("seu novo saldo é: "+saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que voce deseja sacar: ");
                    double saque = scan.nextDouble();

                    if (saque <= saldo) {
                        System.out.println("Saque realizado com sucesso!!");
                        saldo= saldo - saque;
                        System.out.println("Seu novo saldo é: "+saldo);
                    }
                    else{
                        System.out.println("Saldo insuficiente");
                    }
                    
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: "+ saldo);
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opcao invaida. Tente novamente");
                    break;
            }
        }
        scan.close();
    }
}
