import java.util.Scanner;

public class ex0001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero []= new double[3];
        for (int i = 0; i < 3; i++){
            System.out.println("digite um numero: ");
            numero[i] = scan.nextInt();

        }

        double maior =numero[0];


        if (numero[1]>maior) {
            maior= numero[1];
        }
        if (numero[2]> maior) {
            maior= numero[2];   
        }
            
        System.out.printf(" %.2f é o maior numero", maior);

        double multi = numero[0]*numero[1]*numero[2];

        System.out.printf("o resultado é %n%14.2f ", multi);

    }
}
