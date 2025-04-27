
import java.util.Arrays;
import java.util.Scanner;

public class binario {
    public static void main(String[] args) {
    
        Scanner scan= new Scanner(System.in);
        int numeroBina [] = new int[8];
        int numeroDeci = scan.nextInt();
        int temp = numeroDeci;
        boolean controlador = true;

        while (controlador) {
            if (numeroDeci<256){
                for (int i = (numeroBina.length - 1); i >= 0; i--){
                    numeroBina[i] = temp % 2;
                    temp = temp / 2;
                }
                System.out.println("numero binaripo" +Arrays.toString(numeroBina));
                controlador= false;
                break;
            }
            else{
                System.out.println("Voce digitou errado, tente novamente");
                controlador = false;
            }

        }

        
    }
}
