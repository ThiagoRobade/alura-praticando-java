import java.util.Scanner;

public class Ex02ConvertendoParaMaiusculasEMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.println("Digite o texto: ");
        texto = scanner.nextLine();

        System.out.println("Texto em maiúsculas: " + texto.toUpperCase());
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());
        scanner.close();


    }
}
