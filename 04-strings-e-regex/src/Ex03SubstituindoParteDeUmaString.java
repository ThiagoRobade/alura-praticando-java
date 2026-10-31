import java.util.Scanner;

public class Ex03SubstituindoParteDeUmaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine().toLowerCase();
        System.out.println("Digite a palavra a ser substituída: ");
        String palavra = scanner.nextLine().toLowerCase();
        System.out.println("Digite a nova palavra: ");
        String palavraSubstituta = scanner.nextLine().toLowerCase();



        System.out.println("Texto modificado: " + texto.replace(palavra, palavraSubstituta));
        scanner.close();

    }
}
