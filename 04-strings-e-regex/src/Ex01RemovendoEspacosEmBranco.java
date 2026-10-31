import java.util.Scanner;

public class Ex01RemovendoEspacosEmBranco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        nome = nome.trim();

        System.out.println("Nome: " + nome);
        scanner.close();

    }
}
