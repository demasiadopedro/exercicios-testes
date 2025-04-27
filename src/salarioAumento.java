import java.util.Scanner;

public class salarioAumento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o seu salario inicial");
        double salario1= scan.nextDouble();
        double salario2= salario1*1.25;
        System.out.println("Seu novo sálario é "+salario2);

    }
}
