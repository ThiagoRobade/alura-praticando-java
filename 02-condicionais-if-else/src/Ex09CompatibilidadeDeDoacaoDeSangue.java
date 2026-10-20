import java.util.Scanner;

public class Ex09CompatibilidadeDeDoacaoDeSangue {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = leitura.nextInt();
        System.out.println("Informe seu peso:");
        double peso = leitura.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você é compatível para doar sangue.");
        } else {
            System.out.println("Você não é compatível para doar sangue.");
        }

        leitura.close();
    }
}
