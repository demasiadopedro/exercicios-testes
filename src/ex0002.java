import java.util.Scanner;

public class ex0002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double number1 = scan.nextDouble();
        
        System.out.println("Digite um outr0 numero");
        double number2 = scan.nextDouble();

        if (number1 % 2 ==0) {
            System.out.printf("O primeiro numero digitado é par");
        }

        else{
            System.out.printf("O prmeiro numero é impar", number1);
        }


        if (number2 % 2 ==0) {
            System.out.printf(", o segundo numero digitado é par");
        }

        else{
            System.out.printf(", o segundo numero é impar", number2);
        }

    }
}
