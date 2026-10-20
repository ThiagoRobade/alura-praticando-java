import java.util.Scanner;

public class Ex08VerificacaoDeTriangulo {
    public static void main(String[] args) {

        int lado1, lado2, lado3;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do lado 1: ");
        lado1 = leitura.nextInt();
        System.out.println("Digite o valor do lado 2: ");
        lado2 = leitura.nextInt();
        System.out.println("Digite o valor do lado 3: ");
        lado3 = leitura.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("É possível formar um triângulo com os lados informados.");
        } else {
            System.out.println("Não é possível formar um triângulo com os lados informados.");
        }

        leitura.close();
    }
}
