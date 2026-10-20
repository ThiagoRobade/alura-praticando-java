import java.util.Scanner;

public class Ex07VerificandoSeNumeroEstaEmUmIntervalo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        leitura.close();

        if (numero >= 1000 && numero <= 5000) {
            System.out.println("O valor " + numero + ", está dentro do intervalo permitido para empréstimo. ");
        } else {
            System.out.println("O valor " + numero + ", não está dentro do intervalo permitido para empréstimo. ");
        }

    }
}
