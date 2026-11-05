import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08ValidandoCpf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Padrão aceitável 123.456.789-09 ");
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$|^\\d{11}$");
        Matcher matcher = pattern.matcher(cpf);

        if (!matcher.matches()) {
            System.out.println("O código do CPF não é válido.");
        } else {
            System.out.println("O código do CPF é válido.");
        }
        scanner.close();
    }
}