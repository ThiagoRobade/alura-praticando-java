import java.util.Scanner;

public class Ex09PulandoNumerosQueTerminamEm5 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
