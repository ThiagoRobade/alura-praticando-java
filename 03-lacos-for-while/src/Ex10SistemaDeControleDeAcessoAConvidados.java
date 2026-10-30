import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex10SistemaDeControleDeAcessoAConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> convidados = new ArrayList<>();
        String nome;

        while (true) {

            System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            final String nomeBusca = nome;

            if (convidados.stream()
                    .anyMatch(n -> n.equalsIgnoreCase(nomeBusca))) {
                System.out.println("O nome " + nome + " já está na lista de convidados.");
            } else {
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }
        }

        scanner.close();
    }
}
