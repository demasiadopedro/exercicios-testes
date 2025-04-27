import java.util.Scanner;

public class conversaoIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade em ano: ");
        int idadeAno = scan.nextInt();
        System.out.println("Digite quantos meses fazem que vc fez aniversario: ");
        int idadeMes = scan.nextInt();
        System.out.println("Digite quantos dias fazem: ");
        int idadeDia = scan.nextInt();
        int idadeFinal = idadeDia + (idadeAno*365)+ (idadeMes*30);
        System.out.println("Sua idade em dias é: " +idadeFinal);
    }
}
