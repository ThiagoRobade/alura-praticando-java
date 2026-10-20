import java.util.Scanner;

public class Ex10CodigoDeAcessoENivelDePermissao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o código de acesso:");
        int codigo = leitura.nextInt();
        System.out.println("Digite seu nível de acesso:");
        int nivel = leitura.nextInt();

        if (codigo == 2023) {
            if (nivel >= 1 && nivel <= 3) {
                System.out.println("Acesso permitido.");
                System.out.println("Bem-vindo ao sistema.");
            } else {
                System.out.println("Acesso negado, nível de acesso invalido");
            }
        } else {
            System.out.println("Acesso negado, código invalido");
        }

        leitura.close();
    }
}
