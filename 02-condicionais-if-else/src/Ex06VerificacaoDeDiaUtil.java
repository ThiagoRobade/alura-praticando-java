import java.util.Scanner;

public class Ex06VerificacaoDeDiaUtil {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = leitura.nextLine();
        diaDaSemana = diaDaSemana.toLowerCase();

        if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terça") || diaDaSemana.equals("quarta") || diaDaSemana.equals("quinta") || diaDaSemana.equals("sexta")) {
            System.out.println("O dia é útil.");
        } else {
            System.out.println("O dia não é útil.");
        }

        leitura.close();
    }
}
